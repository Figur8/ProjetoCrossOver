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
public class Questao {
    private int Cod;
    private String enumciado;

    public Questao(int Cod, String enumciado) {
        this.Cod = Cod;
        this.enumciado = enumciado;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public String getEnumciado() {
        return enumciado;
    }

    public void setEnumciado(String enumciado) {
        this.enumciado = enumciado;
    }
    
}
