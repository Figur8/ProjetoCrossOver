/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

/**
 *
 * @author Ismael(Figur8)
 */
@PersistenceContext(unitName = "ConcurseiroPU")
@Entity
 @Table(name = "Aluno")
public class Aluno implements Serializable {
    @Id
    private String id;
    
    @Column
    private String senha;

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean autenticacao(String idA, String senhaA){
        //Aideia é boa só não to tendo ideia agora de onde aplicar;

        return false;
    }
}
