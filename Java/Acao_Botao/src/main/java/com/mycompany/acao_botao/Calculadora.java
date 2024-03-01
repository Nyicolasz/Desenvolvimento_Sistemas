/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acao_botao;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
    
    //Criando as variaveis de instancia
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, limpar;
    
    //Criando o metodo construtor
    public Calculadora(){
        super ("Exemplo de soma");
        Container tela = getContentPane();
        
        //Atribuirbcomo null,pois está usando o setBounds (Linha 32)
        setLayout(null);
        
        //Instanciando as variaveis
        rotulo1 = new JLabel("1° número");
        rotulo2 = new JLabel("2° número");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel ("");
        
        somar = new JButton ("Somar");
        subtrair = new JButton ("Subtrair");
        multiplicar = new JButton ("Multiplicar");
        dividir = new JButton ("Dividir");
        limpar = new JButton ("Limpar");
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        
        exibir.setBounds(50,10,200,20);
        
        somar.setBounds(70,100,80,20); subtrair.setBounds(160,100,80,20);
        multiplicar.setBounds(70,300,80,20); dividir.setBounds(160,300,80,20);
        limpar.setBounds(200,400,80,20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        int numero1,numero2, soma;
                        
                        soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        soma = numero1 + numero2;
                        
                        exibir.setVisible(true);
                        exibir.setText("A soma é:" +soma);
                        
                        
                    }
                }
        );
        
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        int numero1,numero2, subtrai;
                        
                        subtrai = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        subtrai = numero1 - numero2;
                        
                        exibir.setVisible(true);
                        exibir.setText("A subtração é:" +subtrai);
                        
                        
                    }
                }
        );
        
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        int numero1,numero2, multiplica;
                        
                        multiplica = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        multiplica = numero1 * numero2;
                        
                        exibir.setVisible(true);
                        exibir.setText("A multiplicação é:" +multiplica);
                        
                        
                    }
                }
        );
        
        
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        int numero1,numero2, divide;
                        
                        divide = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        divide = numero1 / numero2;
                        
                        exibir.setVisible(true);
                        exibir.setText("A divição é:" +divide);
                        
                        
                    }
                }
        );
        
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        texto1.setText(null);
                        texto2.setText(null);
                       
                        texto1.requestFocus();
                        
                        
                    }
                }
        );
        
        exibir.setVisible(false);
        
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(somar); tela.add(subtrair); 
        tela.add(multiplicar); tela.add(dividir); 
        tela.add(limpar); 
        
        tela.add(exibir);
        
        setSize(400,500);
        setVisible(true);
    }
    public static void main (String args []){
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
