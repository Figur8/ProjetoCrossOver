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
@Table(name = "Questao")
public class Questao {   
    @Id
    private int Cod;
    @Column
    private String enumciado;

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
