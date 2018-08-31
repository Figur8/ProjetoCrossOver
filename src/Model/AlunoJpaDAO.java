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
 * @author Ismael(figur8)
 *  -Agradecimentos:devmedia.com
 */
public class AlunoJpaDAO {
    /*FUNCIONAMENTO(para eu não me perder)
      -Primeiro tornamos a classeDAO uma variavel privada
        para poder utilizar como um objeto.
      =Após isso inicia o entityManager(responsável por gerenciar o CRUD)
      =Cria um método para sempre que vazio iniciar novamente a classe ALUNOJpaDAO
      -Retorna ele mesmo.
    */
    private static AlunoJpaDAO instance;
    protected EntityManager entityManager;
   
    public static AlunoJpaDAO getInstance(){
        if(instance == null){
            instance = new AlunoJpaDAO();
        }
        return instance;
    }
    
    private AlunoJpaDAO(){
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CrudHibernatePU");
        if(entityManager == null){
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    
    public Aluno getById(final int id){
        return entityManager.find(Aluno.class, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<Aluno> findAll(){
        return entityManager.createQuery("From" + Aluno.class.getName()).getResultList();
    }
    public void persist(Aluno aluno){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    public void merge(Aluno aluno){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(aluno);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    public void remove(Aluno aluno){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Aluno.class, aluno.getId());
            entityManager.remove(aluno);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    public void removeById(final int id){
        try{
            Aluno aluno;
            aluno = getById(id) ;
            remove(aluno);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
