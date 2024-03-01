/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nycolas
 */
//Declaração de importação e classes
import javax.swing.JOptionPane;
import java.util.Scanner;
//Criando a classe "Exercicio_1"
public class Questao_1 {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
        
        //Declarando variaveis
        int Ninicio, Nfim;
        
        //Entrada de dados
        Ninicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        Nfim = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número:"));
        
        //Inicio do if
        if (Nfim < Ninicio){
            int Troca;
            Troca = Ninicio;
            Ninicio = Nfim;
            Nfim = Troca;
        }//Finalizando o if
        
        System.out.println ("Os númros impares entre "+Ninicio+" e "+Nfim+" é:");
        for (int i=Ninicio; i <=Nfim; i++){
            
             
            if(i%2==1){
                 System.out.println (i);
            }
    }
        
        
}//Finalizando o método "main"
}//Finalizando a classe "Questao_1"