/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.EntityManager;

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
    
        
}
