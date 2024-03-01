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

//Importando classes, atributos, etc especificos
import java.awt.event.*;
import javax.swing.text.*;
import java.text.*;

public class ExemploJFormattedTextField extends JFrame {
    
    //Criando os atributos/variaveis de instancia (objetos) do tipo JPasswordField, JLabel, MaskFormatter
    JLabel rotuloCEP, rotuloTel, rotuloCPF, rotuloData;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaraCEP, mascaraTel, mascaraCPF, mascaraData;
    
    //criando o Metodo construtor (ele não é considerado um metodo)
    public ExemploJFormattedTextField(){
        super ("Exemplo com JFormattedTextField");
        Container tela = getContentPane();
        setLayout(null);
        
        //Instanciando o conteúdo ao JLabel as variaveis
        rotuloCEP = new JLabel ("CPF");
        rotuloTel = new JLabel ("Tel");
        rotuloCPF = new JLabel ("CPF");
        rotuloData = new JLabel ("Data");
        
        
        //Definindo a coluna, linha, largura e altura na janela
        rotuloCEP.setBounds (50, 20, 100, 20);
        rotuloTel.setBounds (50, 60, 100, 20);
        rotuloCPF.setBounds (50, 100, 100, 20);
        rotuloData.setBounds (50, 140, 100, 20);
        
        // try = tratamneto; catch = Exceções; try catch = tratamento de exceções
        try{
            
            //Usando o "#" para criar a mascara
            mascaraCEP = new MaskFormatter ("#####-####");
            mascaraTel = new MaskFormatter ("(##)####-####");
            mascaraCPF = new MaskFormatter ("########-##");
            mascaraData = new MaskFormatter ("##/##/####");
            
            //deixa um traço que conforme digita desaparece
            mascaraCEP.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
        }
        
        /*Aqui dentro coloca decisoes para ver se o 
        que foi digitado nos campos está certo*/
        catch (ParseException excp){/*...*/} 
        
        cep = new JFormattedTextField(mascaraCEP);
        tel = new JFormattedTextField(mascaraTel);
        cpf = new JFormattedTextField(mascaraCPF);
        data = new JFormattedTextField(mascaraData);
        
        cep.setBounds (150, 20, 100, 20);
        tel.setBounds (150, 60, 100, 20);
        cpf.setBounds (150, 100, 100, 20);
        data.setBounds (150, 140, 100, 20);
        
        cep.setForeground(Color.blue);
        tel.setForeground(Color.red);
        cpf.setForeground(Color.green);
        data.setForeground(new Color(255,128,128));
        
        cep.setBackground (Color.YELLOW);
        tel.setBackground (Color.YELLOW);
        cpf.setBackground (new Color (255, 255, 204));
        data.setBackground (new Color (255, 255, 204));
        
        cep.setFont(new Font ("Times New Roman", Font.BOLD, 14));
        tel.setFont(new Font ("Comics Sans MS", Font.PLAIN, 11));
        cpf.setFont(new Font ("Arial", Font.BOLD, 14));
        data.setFont(new Font ("Tahoma", Font.BOLD, 14));
        
        //Atribundo os objetos para a tela
        tela.add(rotuloCEP);
        tela.add(rotuloTel);     
        tela.add(rotuloCPF);
        tela.add(rotuloData);
        
        tela.add(cep);
        tela.add(tel);     
        tela.add(cpf);
        tela.add(data);
        
        setSize(400, 250);
        setVisible(true);
    }
    
    public static void main (String args []){
        ExemploJFormattedTextField app = new ExemploJFormattedTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}