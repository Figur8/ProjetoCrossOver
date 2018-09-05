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
    //instanciando EntityManager
    protected EntityManager entityManager;
   //instance == null é a mesma coisa que dizer(se nada estiver instanciado)
    public static AlunoJpaDAO getInstance(){
        if(instance == null){
            instance = new AlunoJpaDAO();
        }
        return instance;
    }
    //simplificando...(porém não entendi por completo)
    public AlunoJpaDAO(){
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
    public Aluno getById(final String id){
        return entityManager.find(Aluno.class, id);
    }
    //Ainda não entendi esse @SupressWarnings
    @SuppressWarnings("unchecked")
    /**Pesquisando todos! 
     * -Cria uma Lista 
     * -Retorna para essa lista algo que em sql seria Select*(que no caso a seleção é o proprio metodo)From Tabela
     *
    */
    public List<Aluno> findAll(){
        return entityManager.createQuery("From" + Aluno.class.getName()).getResultList();
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
    public void persist(Aluno aluno){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            //Ainda não entendi esse printStackTrace
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    //Faz algo parecido ao persist porém preciso me aprofundar mais...
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
    
    /**
     * Encontra o dado pelo id(.find(parâmetro))
     *  Remove o mesmo após fazer uma busca(.remove(parâmetro))
     *  Commit(confirma)
     * 
     */
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
    
     /**
     * 
     *  encontra e remove diretamente pelo @ID
     */
    public void removeById(final String id){
        try{
            Aluno aluno;
            aluno = getById(id) ;
            remove(aluno);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
