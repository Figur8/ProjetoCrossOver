/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ismael(Figur8)
 */
public class Simulado {
    private int CodSimulado;
    private int codQuest;
    private String idAluno;
    private float peformance;

    public Simulado(int CodSimulado, int codQuest, String idAluno, float peformance) {
        this.CodSimulado = CodSimulado;
        this.codQuest = codQuest;
        this.idAluno = idAluno;
        this.peformance = peformance;
    }

    public int getCodSimulado() {
        return CodSimulado;
    }

    public void setCodSimulado(int CodSimulado) {
        this.CodSimulado = CodSimulado;
    }

    public int getCodQuest() {
        return codQuest;
    }

    public void setCodQuest(int codQuest) {
        this.codQuest = codQuest;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public float getPeformance() {
        return peformance;
    }

    public void setPeformance(float peformance) {
        this.peformance = peformance;
    }
    
    //falta alguns métodos
    
}
