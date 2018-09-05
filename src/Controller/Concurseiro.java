/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Aluno;
import Model.AlunoJpaDAO;
import Model.funcionaai;



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
        Aluno aluno = new Aluno();
        aluno.setId("123");
        aluno.setSenha("123");
        AlunoJpaDAO.getInstance().merge(aluno);
        System.out.println(AlunoJpaDAO.getInstance().getById("123"));
    }
    
}
