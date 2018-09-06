/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
/**
 *
 * @author Ismae
 */
public class OpcoesJpaDAO {
    private static OpcoesJpaDAO instance;
    protected EntityManager entityManager;
   
    public static OpcoesJpaDAO getInstance(){
        if(instance == null){
            instance = new OpcoesJpaDAO();
        }
        return instance;
    }
   
    public OpcoesJpaDAO(){
        entityManager = getEntityManager();
    }
   
    private EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConcurseiroPU");
        if(entityManager == null){
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    //Talvez não funcione por se tratar de uma função sql
    public Opcoes getByID(final int id){
        return entityManager.find(Opcoes.class, id);
    }
   
   @SuppressWarnings("unchecked")
   
    public List<Opcoes> findAll(){
        return entityManager.createQuery("FROM" + Opcoes.class.getName()).getResultList();
    }
   
    public void persist(Opcoes opcoes){
        try{
           entityManager.getTransaction().begin();
           entityManager.persist(opcoes);
           entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
       
    public void merge(Opcoes opcoes){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(opcoes);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
   
    public void remove(Opcoes opcoes){
        try{
            entityManager.getTransaction().begin();
            //Lembrar de trocar ID para o seu representativo nao diagrama de classes
            entityManager.find(Opcoes.class, opcoes.getId());
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
   
    public void removeById(final int id){
        try{
            Opcoes opcoes;
            opcoes = getByID(id);
            remove(opcoes);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}