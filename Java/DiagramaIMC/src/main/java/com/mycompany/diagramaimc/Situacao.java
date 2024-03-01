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
public class Situacao {

    //declarando variável de instância privada do tipo String
    private String situacao;

    //Método construtor onde não recebe nenhum parâmetro. 
    public Situacao() {
        this.situacao = "";
    }

    //Método get e set de "situacao"
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    //Método verificarSituacao onde pede um parâmetro do tipo IMC. 
    public void verificarSituacao(IMC p) {

        /*Estrutura de decisão onde p pega o valor de imc na class IMC
        e atribui uma mensagem à "situacao"*/
        if (p.getImc() < 18.5) {
            this.situacao = "Abaixo do peso";
        } else if (p.getImc() >= 18.5 && p.getImc() <= 25) {
            this.situacao = "Peso Normal";
        } else if (p.getImc() > 25 && p.getImc() <= 30) {
            this.situacao = "Acima do peso";
        } else if (p.getImc() > 30) {
            this.situacao = "Obeso";
        }//Finalizando a estrutura de decisão*/
    }

}
