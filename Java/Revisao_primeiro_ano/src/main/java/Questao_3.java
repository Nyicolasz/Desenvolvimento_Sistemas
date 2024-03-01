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
//Criando a classe "Questao_3"
public class Questao_3 {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
        int Quant = 0 ;
       int Vetor[] = new int [15];
       
       for (int i = 0; i < 15; i++){
           Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
       } 
       
       for (int i = 0; i < 15; i++){
           if(Vetor[i]>30){
               Quant++;
           }
       }
        JOptionPane.showMessageDialog(null, "A quantidade de números digitados maiores que 30 é de: " +Quant);
       
        }//Finalizando o método "main"
}//Finalizando a classe "Questao_3"
    