/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Aluno;
import Model.AlunoJpaDAO;



/**
 *
 * @author Ismae
 */
public class Concurseiro {

    /**
     * @param args
     * @Ismael(figur8)
     *
     */
    public static void main(String[] args) {
        //Demonstração de uso dos metodos DAO
        Aluno ok = new Aluno();
        ok.setId("ewq");
        ok.setSenha("asda");
        AlunoJpaDAO.getInstance().merge(ok);
    }
    
}
