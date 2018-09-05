/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Ismae
 */
public class funcionaai {
    private EntityManager em;
    
    public funcionaai(){
        this.em = Persistence.createEntityManagerFactory("ConcurseiroPU").createEntityManager();
    }
    
    //@Test
    public void inserir(){
        Aluno ok = new Aluno();
        ok.setId("ewq");
        ok.setSenha("asda");
        em.getTransaction().begin();
        em.persist(ok);
        em.getTransaction().commit();
    }
}
