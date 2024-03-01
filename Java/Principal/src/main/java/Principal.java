/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario();
        
        usuario1.nome = JOptionPane.showInputDialog("Digite seu nome:");
        usuario1.email = JOptionPane.showInputDialog("Digite seu email:");
        usuario1.login = JOptionPane.showInputDialog("Digite seu login:");
        usuario1.senha = JOptionPane.showInputDialog("Digite sua senha:");
        
        System.out.println("Nome: "+usuario1.nome);
        System.out.println("Email: "+usuario1.email);
        System.out.println("Login: "+usuario1.login);
        System.out.println("Senha: "+usuario1.senha);
        
        usuario1.provarExistencia();
    }
}
