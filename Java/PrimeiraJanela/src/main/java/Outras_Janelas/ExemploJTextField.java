/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Outras_Janelas;

/**
 *
 * @author rayli
 */
import javax.swing.*;
import java.awt.*;

public class ExemploJTextField extends JFrame {
    
    //Criando os objetos do tipo JLabel
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    
    //Criando os objetos do tipo JTextField
    JTextField texto1, texto2,texto3,texto4;
    
    public ExemploJTextField(){
        super ("Exemplo com JTextField");
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
        
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo1.setBounds (50, 20, 80, 20);
        rotulo2.setBounds (50, 60, 80, 20);
        rotulo3.setBounds (50, 100, 80, 20);
        rotulo4.setBounds (50, 140, 80, 20);
        
        texto1.setBounds (110, 20, 200, 20);
        texto2.setBounds (110, 60, 25, 20);
        texto3.setBounds (110, 100, 80, 20);
        texto4.setBounds (110, 140, 80, 20);
        
        //Atribundo os objetos para a tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main (String args []){
        ExemploJTextField app = new ExemploJTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
