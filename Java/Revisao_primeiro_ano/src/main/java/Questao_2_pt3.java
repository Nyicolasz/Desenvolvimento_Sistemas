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
//Criando a classe "Questao_2_pt3"
public class Questao_2_pt3 {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
        int QuantPar = 0, Soma = 0;
        int Vetor[] = new int [10];
       
       for (int i = 0; i < 10; i++){
           Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
       } 
       
        for (int i = 0; i < 10; i++){
           if(Vetor[i]%2==0){
               QuantPar++;
           }
           else{
               Soma = Soma + Vetor[i];
           }
       } 
        JOptionPane.showMessageDialog(null, "Foram digitados "+QuantPar+ " númerops pares e a soma dos números ímpares é de "+Soma);
} 
}
    //Finalizando o método "main"}//Finalizando a classe "Questao_2_pt3"

