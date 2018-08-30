/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Ismael(Figur8)
 */

@Entity
public class Aluno {
    @Id
    private String id;
    private String senha;

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
