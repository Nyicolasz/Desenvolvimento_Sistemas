/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaimc;

/**
 *
 * @author nycol
 */
//Classe pública chamada ConversorNumeros
public class ConversorNumeros {

    //Método público do tipo inteiro chamado stringToInt onde pede um parâmetro do tipo String. 
    public Integer stringToInt(String numero) {

        //variável que recebe a conversão de String para Int
        int conversor = Integer.parseInt(numero);

        //retorna essa conversão
        return (conversor);
    }

    //Método público do tipo inteiro chamado stringToDouble onde pede um parâmetro do tipo Double. 
    public Double stringToDouble(String numero) {

        //variável que recebe a conversão de String para Double
        double conversor = Double.parseDouble(numero);

        //retorna essa conversão
        return (conversor);
    }
}
