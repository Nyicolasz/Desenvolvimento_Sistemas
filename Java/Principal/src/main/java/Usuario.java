/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Usuario {
    
    //Atributos
    String nome;
    String email;
    String login;
    String senha;
    
    //Contrutores
    //Inicializa os atributos vazios
    public Usuario(){
        this("","","","");
    }
    
    // Inicializa os atributos com valores passados por parametro
    public  Usuario (String email, String login, String nome, String senha){
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }
    
    //Getters e Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String nome){
        this.email = email;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String nome){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String nome){
        this.senha = senha;
        
    }
    
    //Implementação dos demais getters e setters
    
    //Métodos especificos da classe
    public void provarExistencia(){
        System.out.println("Oi, eu existo!");
    }
    
}
