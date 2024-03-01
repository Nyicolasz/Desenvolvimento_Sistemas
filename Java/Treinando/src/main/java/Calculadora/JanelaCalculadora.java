/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author rayli
 */
//importação de pacotes
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class JanelaCalculadora extends JFrame {
    
    //Criando as variaveis de instancia (objetos)
    
    JLabel rotulo1, rotulo2, Resultado;
    JTextField texto1, texto2, TextResul;
    JButton Soma, Subtracao, Multiplicacao, Divisao,
            Botao1,Botao2,Botao3,Botao4,Botao5,
            Botao6,Botao7,Botao8,Botao9,Botao0;
    
    ImageIcon IconeMais, IconeMenos, IconeMulti, IconeDivi;
    
    //metodo construtor
    public JanelaCalculadora (){
    
        super("Calculadora Nycolas");
        
        Container TelaCalcul = getContentPane();
        
        setLayout(null);
        
        
        //Atribuindo os conteudos nas variaveis de instancia da Janela
        
        rotulo1 = new JLabel ("Digite um número:");
        texto1 = new JTextField(10);
        
        rotulo2 = new JLabel ("Digite um número:");
        texto2 = new JTextField(10);
        
        Resultado = new JLabel ("Resultado:");
        TextResul = new JTextField(10);
        
        IconeMais = new ImageIcon("mais.png");
        IconeMenos = new ImageIcon("menos.png");
        IconeMulti = new ImageIcon("multi.png");
        IconeDivi = new ImageIcon("divi.png");
        
        Soma = new JButton (IconeMais);
        Subtracao = new JButton (IconeMenos);
        Multiplicacao = new JButton (IconeMulti);
        Divisao = new JButton (IconeDivi);
        
        Botao1 = new JButton ("1");
        Botao2 = new JButton ("2");
        Botao3 = new JButton ("3");
        Botao4 = new JButton ("4");
        Botao5 = new JButton ("5");
        Botao6 = new JButton ("6");
        Botao7 = new JButton ("7");
        Botao8 = new JButton ("8");
        Botao9 = new JButton ("9");
        Botao0 = new JButton ("0");
        
        
        rotulo1.setBounds (180,20,110,80);
        texto1.setBounds (50,80,380,30);
        
        rotulo2.setBounds (180,100,110,80);
        texto2.setBounds (50,160,380,30);
        
        Resultado.setBounds (205,180,110,80);
        TextResul.setBounds (50,240,380,30);
        
        Soma.setBounds (50,300,50,50);
        Subtracao.setBounds (150,300,50,50);
        Multiplicacao.setBounds (280,300,50,50);
        Divisao.setBounds (380,300,50,50);
        
        Botao1.setBounds (50,400,50,50);
        Botao2.setBounds (150,400,50,50);
        Botao3.setBounds (214,400,50,50);
        Botao4.setBounds (280,400,50,50);
        Botao5.setBounds (380,400,50,50);
        Botao6.setBounds (50,400,50,50);
        Botao7.setBounds (50,400,50,50);
        Botao8.setBounds (50,400,50,50);
        Botao9.setBounds (50,400,50,50);
        Botao0.setBounds (50,400,50,50);
        
        Soma.addActionListener(
        
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int n1,n2,R;
                        
                        n1 = Integer.parseInt(texto1.getText());
                        n2 = Integer.parseInt(texto2.getText());
                        
                        R = n1 + n2;
                        
                        TextResul.setText(""+R);
                    }
                }
        );
        
        Subtracao.addActionListener(
        
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int n1,n2,R;
                        
                        n1 = Integer.parseInt(texto1.getText());
                        n2 = Integer.parseInt(texto2.getText());
                        
                        R = n1 - n2;
                        
                        TextResul.setText(""+R);
                    }
                }
        );
        
        Multiplicacao.addActionListener(
        
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int n1,n2,R;
                        
                        n1 = Integer.parseInt(texto1.getText());
                        n2 = Integer.parseInt(texto2.getText());
                        
                        R = n1 * n2;
                        
                        TextResul.setText(""+R);
                    }
                }
        );
        
        Divisao.addActionListener(
        
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int n1,n2,R;
                        
                        n1 = Integer.parseInt(texto1.getText());
                        n2 = Integer.parseInt(texto2.getText());
                        
                        R = n1 / n2;
                        
                        TextResul.setText(""+R);
                    }
                }
        );
        
        Botao1.addActionListener(
        
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                      
                        texto1.setText("1");
                    }
                }
        );
        
        
        TelaCalcul.add(rotulo1);
        TelaCalcul.add(texto1);
        
        TelaCalcul.add(rotulo2);
        TelaCalcul.add(texto2);
        
        TelaCalcul.add(Resultado);
        TelaCalcul.add(TextResul);
        
        TelaCalcul.add(Soma);
        TelaCalcul.add(Subtracao);
        TelaCalcul.add(Multiplicacao);
        TelaCalcul.add(Divisao);
        
        TelaCalcul.add(Botao1);
        TelaCalcul.add(Botao2);
        TelaCalcul.add(Botao3);
        TelaCalcul.add(Botao4);
        TelaCalcul.add(Botao5);
        
        setSize (500,700);
        setVisible (true);
}
}
