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

public class Exercicio_2 extends JFrame{
    
    //Criando as variaveis de instancia
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, cadastro,rotuloTitulo;
    JTextField texto1, texto2, texto3, texto4;
    JButton ConCadastro;
    
    //Criando o metodo construtor
    public Exercicio_2(){
        super ("Exemplo de soma");
        Container tela = getContentPane();
        
        //Atribuirbcomo null,pois está usando o setBounds (Linha 32)
        setLayout(null);
        
        //Instanciando as variaveis
        rotuloTitulo = new JLabel("Cadastro de Professor:"); ;
        rotulo1 = new JLabel("Nome:");
        rotulo2 = new JLabel("Matrícula:");
        rotulo3 = new JLabel("Disciplina:");
        rotulo4 = new JLabel("Qtd de aulas::");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        
        
        ConCadastro = new JButton ("Confirmar Cadastro");
        
        
        //Definindo a coluna, linha, largura e altura na janela
        rotuloTitulo.setBounds(20,30,200,20);
        
        rotulo1.setBounds(20,80,100,20); rotulo2.setBounds(20,120,100,20); rotulo3.setBounds(20,160,100,20); rotulo4.setBounds(20,200,100,20);
        texto1.setBounds(120,80,300,20); texto2.setBounds(120,120,100,20);  texto3.setBounds(120,160,200,20); texto4.setBounds(120,200,200,20);
        ConCadastro.setBounds(20,300,200,20);
        
        rotuloTitulo.setFont(new Font ("Arial", Font.BOLD, 16));
        
        
        ConCadastro.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                       JOptionPane.showMessageDialog(null, "Nome: "+(texto1.getText()) + "\n Matrícula: " + (texto2.getText()) + "\n Disciplina: " + (texto3.getText()) + "\n Qtd de aulas: " + (texto4.getText()));
                        
                    }
                }
        ); 
         
        
        
        
        tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4);
        tela.add(texto1); tela.add(texto2); tela.add(texto3); tela.add(texto4);
        tela.add(ConCadastro); tela.add(rotuloTitulo);
        
        tela.setBackground(new Color(255,212,189));
        
        
        setSize(500,400);
        setVisible(true);
    }
    public static void main (String args []){
        Exercicio_2 app = new Exercicio_2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
