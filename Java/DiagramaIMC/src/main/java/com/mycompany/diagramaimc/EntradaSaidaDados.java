/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaimc;

/**
 *
 * @author nycol
 */
//Declaração de importação
import javax.swing.JOptionPane;

//Classe pública chamada EntradaSaidaDados
public class EntradaSaidaDados {

    //Método tipo String chamado entradaDados onde pede uma parâmetro tipo String
    public String entradaDados(String mensagemEntrada) {
        
        //Retorna uma janela gráfica com a mensagem recebida 
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    //Método tipo String chamado saidaDados onde pede uma parâmetro tipo String
    public void saidaDados(String mensagemSaida) {
        
        //Retorna uma janela gráfica com a mensagem recebida 
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
