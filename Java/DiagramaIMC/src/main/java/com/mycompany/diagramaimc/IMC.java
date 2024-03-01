/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaimc;

/**
 *
 * @author nycol
 */
//Classe pública chamada Situacao
public class IMC {

    //declarando variáveis de instância privadas do tipo double
    private double peso;
    private double altura;
    private double imc;

    //Método construtor onde não recebe nenhum parâmetro. 
    public IMC() {
        this.peso = 0.0;
        this.altura = 0.0;
        this.imc = 0.0;
    }

    //Método cadastrarDados onde pede dois parâmetro do tipo double. 
    public void cadastrarDados(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    //Método calcularIMC() do tipo Double
    public Double calcularIMC() {

        /*Cálculo do imc, onde altura recebe o próprio valor ao quadrado e 
        "this.imc" recebe o resultado de peso dividido por altura*/
        this.imc = peso / (altura = Math.pow(altura, 2));

        //retorna o resultado de conta
        return imc;
    }

}
