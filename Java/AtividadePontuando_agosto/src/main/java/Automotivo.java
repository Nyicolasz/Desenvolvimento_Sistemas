/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nycolas
 */
import javax.swing.JOptionPane;

public class Automotivo {

    private String modelo;
    private String marca;
    private String ano;
    private String cor;

    public Automotivo() {
        this("", "", "", "");
    }

    public Automotivo(String modelo, String marca, String ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void provarExistencia() {
        JOptionPane.showMessageDialog(null, "modelo: " + modelo + "\n marca: " + marca + "\n ano: " + ano + "\n cor: " + cor);
    }

    public void entraDados() {
        modelo = JOptionPane.showInputDialog("Digite modelo");
        marca = JOptionPane.showInputDialog("Digite marca");
        ano = JOptionPane.showInputDialog("Digite ano");
        cor = JOptionPane.showInputDialog("Digite cor");
    }

}
