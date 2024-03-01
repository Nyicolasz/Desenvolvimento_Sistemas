/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acao_botao;

/**
 *
 * @author Admin
 */
//importar
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Soma extends JFrame{
    
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar;
    public Soma(){
        super ("Exemplo de soma");
        Container tela = getContentPane();
        
        //Atribuirbcomo null,pois está usando o setBounds (Linha 32)
        setLayout(null);
        
        rotulo1 = new JLabel("1° número");
        rotulo2 = new JLabel("2° número");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel ("");
        
        somar = new JButton ("Somar");
        
        
        
        //Definindo a coluna, linha, largura e altura na janela
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,120,200,20); somar.setBounds(150,100,80,20);
        
        
        //Adicionar ação a lista que estará dentro do botão (a logica)
        somar.addActionListener(
                
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    
                        int numero1,numero2, soma;
                        
                        soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto1.getText());
                        soma = numero1 + numero2;
                        
                        exibir.setVisible(true);
                        exibir.setText("A soma é:" +soma);
                        
                        
                    }
                }
        );
        
        exibir.setVisible(false);
        
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(somar); tela.add(exibir);
        
        setSize(400,500);
        setVisible(true);
    }
    public static void main (String args []){
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
