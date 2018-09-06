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
public class SimuladoJpaDAO {
        private static SimuladoJpaDAO instance;
    //instanciando EntityManager
    protected EntityManager entityManager;
   //instance == null é a mesma coisa que dizer(se nada estiver instanciado)
    public static SimuladoJpaDAO getInstance(){
        if(instance == null){
            instance = new SimuladoJpaDAO();
        }
        return instance;
    }
    //simplificando...(porém não entendi por completo)
    public SimuladoJpaDAO(){
        entityManager = getEntityManager();
    }
    //Configurando a relação entre essa classee opersistence.xml pelo("ConcurseiroPU")
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConcurseiroPU");
        if(entityManager == null){
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    //Pesquisando pelo @ID
    public Simulado getById(final String id){
        return entityManager.find(Simulado.class, id);
    }
    //Ainda não entendi esse @SupressWarnings
   @SuppressWarnings("unchecked")
    /**Pesquisando todos!
     * -Cria uma Lista
     * -Retorna para essa lista algo que em sql seria Select*(que no caso a seleção é o proprio metodo)From Tabela
     *
    */
    public List<Simulado> findAll(){
        return entityManager.createQuery("From" + Simulado.class.getName()).getResultList();
    }
   
    /**
     * Não irei me repetir nos proximos e explicarei somente o que for diferente...
     * Respectivamente:
     * -Abre uma transação(getTransaction().begin())
     * -Persiste a informação do parâmetro no caso(aluno)(.persist())
     * -Commita(Confirma) essa tranação(.commit())
     * -Caso algum erro o "catch" irá dar rollback em tudo o que for feito(.rollback()).
     *
     */
    public void persist(Simulado simulado){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(simulado);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            //Ainda não entendi esse printStackTrace
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    //Faz algo parecido ao persist porém preciso me aprofundar mais...
    public void merge(Simulado simulado){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(simulado);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
   
    /**
     * Encontra o dado pelo id(.find(parâmetro))
     *  Remove o mesmo após fazer uma busca(.remove(parâmetro))
     *  Commit(confirma)
     *
     */
    public void remove(Simulado simulado){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Simulado.class, simulado.getCodSimulado());
            entityManager.remove(simulado);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
   
     /**
     *
     *  encontra e remove diretamente pelo @ID
     */
    public void removeById(final String id){
        try{
            Simulado simulado;
            simulado = getById(id) ;
            remove(simulado);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
