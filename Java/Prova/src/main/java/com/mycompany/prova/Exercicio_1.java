/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Exercicio_1 extends JFrame{
    
    //Criando as variaveis de instancia
    JLabel Nome, CPF, RG, Endereco, Bairro, CEP, Cidade, Estado, Login, Senha, Telefone, Calular, email, rotuloTitulo;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12, texto13;
    JButton Inserir, Alterar, Excluir, Pesquisar, Fechar;
    
    //Criando o metodo construtor
    public Exercicio_1(){
        super ("Prova_1");
        Container tela = getContentPane();
        
        //Atribuirbcomo null,pois está usando o setBounds (Linha 32)
        setLayout(null);
        
        //Instanciando as variaveis
        rotuloTitulo = new JLabel("Cadastro de Clientes"); ;
        Nome = new JLabel("Nome:");
        CPF = new JLabel("CPF:");
        Endereco = new JLabel("Endereço:");
        Bairro = new JLabel("Bairro:");
        CEP = new JLabel("CEP:"); ;
        Cidade = new JLabel("Cidade:");
        Estado = new JLabel("Estado:");
        Login = new JLabel("Login:");
        Senha = new JLabel("Senha:");
        Telefone = new JLabel("Telefone:");
        Calular = new JLabel("Calular:");
        email = new JLabel("email:");
         RG = new JLabel("RG:");
        
        
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        texto4 = new JTextField(5);
        texto5 = new JTextField(5);
        texto6 = new JTextField(5);
        texto7 = new JTextField(5);
        texto8 = new JTextField(5);
        texto9 = new JTextField(5);
        texto10 = new JTextField(5);
        texto11= new JTextField(5);
        texto12 = new JTextField(5);
        texto13 = new JTextField(5);
        
        
        Inserir = new JButton ("Inserir");
        Alterar = new JButton ("Alterar");
        Excluir = new JButton ("Excluir");
        Pesquisar = new JButton ("Pesquisar");
        Fechar = new JButton ("Fechar");
        
        
        //Definindo a coluna, linha, largura e altura na janela
        rotuloTitulo.setBounds(150,30,200,20);
        
        Nome.setBounds(30,80,200,20);
        texto1.setBounds(70,80,350,20);
        
        CPF.setBounds(40,110,200,20);
        texto2.setBounds(80,110,100,20);
        
        RG.setBounds(200,110,200,20);
        texto3.setBounds(240,110,180,20);
        
        Endereco.setBounds(20,140,200,20);
        texto4.setBounds(80,140,340,20);
        
        Bairro.setBounds(40,170,200,20);
        texto5.setBounds(80,170,180,20);
        
        CEP.setBounds(280,170,200,20);
        texto6.setBounds(320,170,100,20);
        
        Cidade.setBounds(40,200,200,20);
        texto7.setBounds(90,200,230,20);
        
        Estado.setBounds(320,200,200,20);
        texto8.setBounds(370,200,50,20);
        
        Login.setBounds(40,230,200,20);
        texto9.setBounds(80,230,100,20);
        
         Senha.setBounds(40,260,200,20);
        texto10.setBounds(80,260,100,20);
        
        Telefone.setBounds(40,290,200,20);
        texto11.setBounds(95,290,150,20);
        
        Calular.setBounds(250,290,200,20);
        texto12.setBounds(300,290,100,20);
        
         email.setBounds(30,320,200,20);
        texto13.setBounds(70,320,350,20);
        
        Inserir .setBounds(30,360,80,20);
        Alterar .setBounds(120,360,80,20);
        Excluir .setBounds(210,360,80,20);
        Pesquisar .setBounds(300,360,80,20);
        Fechar .setBounds(390,360,80,20);
        
        rotuloTitulo.setFont(new Font ("Arial", Font.BOLD, 16));
        
         tela.add(rotuloTitulo);
         
         tela.add(Nome); tela.add(texto1);
          tela.add(CPF); tela.add(texto2);
           tela.add(RG); tela.add(texto3);
           tela.add(Endereco); tela.add(texto4);
           tela.add(Bairro); tela.add(texto5);
           tela.add(CEP); tela.add(texto6);
           tela.add(Cidade); tela.add(texto7);
            tela.add(Estado); tela.add(texto8);
            tela.add(Login); tela.add(texto9);
            tela.add(Senha); tela.add(texto10);
            tela.add(Telefone); tela.add(texto11);
            tela.add(Calular); tela.add(texto12);
            tela.add(email); tela.add(texto13);
            
            tela.add(Inserir); tela.add(Alterar);  tela.add(Excluir); tela.add(Pesquisar); tela.add(Fechar); 
        
        setSize(500,600);
        setVisible(true);
    }
    public static void main (String args []){
        Exercicio_1 app = new Exercicio_1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}