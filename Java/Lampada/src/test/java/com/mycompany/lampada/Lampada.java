/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada;

/**
 *
 * @author Admin
 */
public class Lampada {
    
    private String estadoDaLampada = "apagada";
    
    public void acende (){
        String estadoDaLampada = "acessa";
    }
    public void apaga(){
        String estadoDaLampada = "apagada";
    }
    public void mostraEstado(){
        if (estadoDaLampada.equals("acessa")){
            System.out.println("Está acessa!");
        }else{
            System.out.println("Está apagada");
        }
    }
}
