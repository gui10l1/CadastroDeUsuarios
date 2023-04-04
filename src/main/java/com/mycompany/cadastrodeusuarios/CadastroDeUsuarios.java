/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodeusuarios;

import classes.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class CadastroDeUsuarios {

    public static void main(String[] args) {
        //Instanciando classe
        Usuario u = new Usuario();
        ArrayList<String> array = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        //Variáveis
        String email;
        String senha;
        String proc;
        String opcao;
        String continuar;
        boolean running = true;
        
        //Processamento                
        while(running){
            System.out.println("* * * * * * * * * * * *");
            System.out.println("* Escolha uma opção:  *");
            System.out.println("* * * * * * * * * * * *");
            System.out.println("[1] Cadastrar um novo usuário");
            System.out.println("[2] Listar todos os usuários");
            System.out.println("[3] Procurar usuário por email");
            System.out.println("[4] Excluir um usuário por email");
            System.out.println("[5] Finalizar o programa");
            System.out.print("Digite uma opção: ");
            
            opcao = sc.nextLine();
            
            switch(opcao){
                case "1": System.out.print("Digite o email do usuario: ");
                email = sc.nextLine();
                System.out.print("Digite a senha do usuario: ");
                senha = sc.nextLine();
                
                u.setEmail(email);
                u.setSenha(senha);
                
                array.add(u.getEmail());

                System.out.print("Aperte enter para continuar");
                continuar = sc.nextLine();
                
                break;
                
                case "2": 
                for(int i = 0; i < array.size(); i++){
                    String elemento = array.get(i);
                    System.out.println("Usuário " +i+ " : " + elemento);
                }
                
                System.out.print("Aperte enter para continuar");
                continuar = sc.nextLine();
                
                break;
                
                case "3":
                for(int i = 0; i < array.size(); i++){
                    System.out.print("Digite o email requerido: ");
                    proc = sc.nextLine();
                    if(proc.equals(array.get(i))){
                        System.out.println("Usuario "+ i +" : " + proc);
                    }
                }
                
                System.out.print("Aperte enter para continuar");
                continuar = sc.nextLine();
                
                break;
                
                case "4": 
                for(int i = 0; i < array.size(); i++){
                    System.out.print("Digite o email requerido:");
                    proc = sc.nextLine();
                    if(proc.equals(array.get(i))){
                        array.remove(i);
                        System.out.println("Usuário removido com sucesso!");
                    }else{
                        System.out.println("Email não encontrado!");
                    }
                }
                
                System.out.print("Aperte enter para continuar");
                continuar = sc.nextLine();
                    
                break;
                
                case "5": running = false;
                break;
            }
        }
    }
}
