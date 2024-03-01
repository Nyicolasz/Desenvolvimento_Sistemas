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
//Criando a classe "Questao_3_pt2"
public class Questao_3_pt2 {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
       
         int Numero, Centena = 0; 
         
         Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); 
         
         if (Numero > 99){
             Centena = Numero / 100;
         }
         
         if (Centena >= 1 && Centena < 10) {
             
             if (Centena%2==0){
                 JOptionPane.showMessageDialog(null, " O número que está na casa das centenas é o  "+Centena+ " e ele é par" );
             }
             else{
                 JOptionPane.showMessageDialog(null, " O número que está na casa das centenas é o  "+Centena+ " e ele é impar" );
             }
         }
         else{
             JOptionPane.showMessageDialog(null, "Este número não é uma centena" );
         }
    } 
}
    //Finalizando o método "main"}//Finalizando a classe "Questao_3_pt2,"
