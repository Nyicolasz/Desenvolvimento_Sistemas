/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaimc;

/**
 *
 * @author nycol
 */
//Classe pública chamada Princpial
public class Principal {
    //Método main
    public static void main(String[] args) {
        //Criando variavél de instância chamada Menu que herda da classe MenuIMC
        MenuIMC Menu = new MenuIMC();
        //Objeto chamando o método executarIMC() na classe MenuIMC
        Menu.executarIMC();
    }
}
