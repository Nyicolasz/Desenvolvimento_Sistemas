/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotivo;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Automotivo {
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo (){
        this("", "", 0, "");
    }
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public Integer getAno(){
        return ano;
    }
    
    public void setAno(Integer ano){
        this.ano = ano;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void provaExistencia(){
        //System.out.println("Modelo:" + this.getModelo());
        //System.out.println("Marca:" + this.getMarca());
        //System.out.println("Ano:" + this.getAno());
        //System.out.println("Cor:" + this.getCor());
        
        JOptionPane.showMessageDialog(null, "Modelo: " +this.getModelo() + "\n Marca:" 
                + this.getMarca() + "\n Ano: " + this.getAno() + "\n  Cor: " + this.getCor());
        //JOprionPane.shorMessageDialog(null, "Marca: "+this.getMarca());
        //JOprionPane.shorMessageDialog(null, "Ano: "+this.getAno());
        //JOprionPane.shorMessageDialog(null, "Cor: "+this.getCor());
        
    }
    
    public void entradaDados() {
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca (marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno (ano);
        cor = JOptionPane.showInputDialog("Cor: ");
        setCor (cor);
    }
    
    public static void main (String[] args){
        Automotivo autol;
        autol = new Automotivo();
        autol.entradaDados();
        autol.provaExistencia();
    }
}

    
        
