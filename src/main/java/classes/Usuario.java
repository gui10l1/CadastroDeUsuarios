/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class Usuario {
    private String email;
    private String senha;
    private ArrayList<Usuario> usuarios;
    
    //Email e senha
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    //ArrayList usuarios
    public void setUsuario(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    
    public ArrayList getUsuario(){
        return usuarios;
    }
}
