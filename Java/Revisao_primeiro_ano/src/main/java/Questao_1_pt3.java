/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  @author Nycolas
 */
//Declaração de importação e classes
import javax.swing.JOptionPane;
//Criando a classe "Questao_1_pt3"
public class Questao_1_pt3 {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
       
        //Declarando variaveis
         int N, Soma = 0; 
         
         //Entrada do primeiro dado para testar no while
         N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); 
         
         
         while(N!=0){//Inicio do while
             Soma = Soma + N;
             N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
         }
         
         JOptionPane.showMessageDialog(null, "A soma de todos os números digitados foi de: "+Soma );
    } 
}
    //Finalizando o método "main"}//Finalizando a classe "Questao_1_pt3"
