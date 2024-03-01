/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_fixacao_maio;

/**
 *
 * @author Admin
 */

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Exercicio_1 extends JFrame{
    
    //Criando as variaveis de instancia
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, textoMd;
    JTextField texto1, texto2, texto3, texto4;
    JButton media;
    
    //Criando o metodo construtor
    public Exercicio_1(){
        super ("Exemplo de soma");
        Container tela = getContentPane();
        
        //Atribuirbcomo null,pois está usando o setBounds (Linha 32)
        setLayout(null);
        
        //Instanciando as variaveis
        rotulo1 = new JLabel("1° nota");
        rotulo2 = new JLabel("2° nota");
        rotulo3 = new JLabel("3° nota");
        rotulo4 = new JLabel("4° nota");
        textoMd = new JLabel("A media é: ");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        
        media = new JButton ("Exibir média");
       
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);  rotulo3.setBounds(50,100,100,20); rotulo4.setBounds(50,140,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20); texto3.setBounds(120,100,200,20); texto4.setBounds(120,140,200,20);
        media.setBounds(50,200,200,20); textoMd.setBounds(50,300,200,20);
        
        
       
        
        media.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        double numero1,numero2, numero3, numero4, md;
                        
                        md = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        numero3 = Double.parseDouble(texto3.getText());
                        numero4 = Double.parseDouble(texto4.getText());
                        md = (numero1 + numero2 + numero3 + numero4)/4;
                        
                        textoMd.setVisible(true);
                        textoMd.setText("A media é:" +md);
                        
                        
                    }
                }
        );
        
        
        
        textoMd.setVisible(false);
        
        
        tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4);
        tela.add(texto1); tela.add(texto2) ;tela.add(texto3); tela.add(texto4);
        tela.add(media); tela.add(textoMd);
        
        setSize(400,500);
        setVisible(true);
    }
    public static void main (String args []){
        Exercicio_1 app = new Exercicio_1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}