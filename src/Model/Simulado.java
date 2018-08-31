/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ismael(Figur8)
 */

@Entity
@Table(name = "Simulado")
public class Simulado {
    @Id
    private int CodSimulado;
    @Column
    private int codQuest;
    @Column
    private String idAluno;
    @Column
    private float peformance;

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
    
    /*
      IDEIAS A SEREM DEBATIDAS APÓS CONCLUSÃO
      -Inclusão de um cronômetro
    */
    
}
