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
public class Opcoes {
    private int CodQuest;
    private String Descricao;
    private boolean valor;

    public Opcoes(int CodQuest, String Descricao, boolean valor) {
        this.CodQuest = CodQuest;
        this.Descricao = Descricao;
        this.valor = valor;
    }

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
