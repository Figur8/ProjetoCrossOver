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
 @Table(name = "Opcoes")
public class Opcoes {
    @Id
    private int id;
    
    @Column
    private String Descricao;
    @Column
    private boolean valor;
    @Column
    private int CodQuest;

    public int getCodQuest() {
        return CodQuest;
    }

    public void setCodQuest(int CodQuest) {
        this.CodQuest = CodQuest;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
    
    
}
