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

    

public class ExemploBotao extends JFrame {
    
    //Criando os objetos do tipo JButton ImagemIcon
    JButton botao, BotaoN, BotaoT;
    ImageIcon icone;
    
    //criando o Metodo construtor (ele não é considerado um metodo)
    public ExemploBotao(){
        
        super ("Exemplo com JButton");
        
        //Criando o objeto tela
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        
        //Objetos herdando componentes dos seus respectivos tipos
        BotaoN = new JButton ("Novo");
        
        icone = new ImageIcon("open_alt.png");
        BotaoT = new JButton ("Abrir", icone);
        
        icone = new 
        botao = new JButton (icone);
        
        //Definindo a coluna, linha, largura e altura na janela
        BotaoN.setBounds (50, 20, 100, 50);
        BotaoT.setBounds (50, 80, 100, 50);
        botao.setBounds (50, 140, 100, 50);
        
        
        
        //Atribundo os objetos para a tela
        tela.add(botao);
        tela.add(BotaoN); 
        tela.add(BotaoT); 
        
        setSize(400, 250);
        setVisible(true);
        
    }
    
    public static void main (String args []){
        ExemploBotao app = new ExemploBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
