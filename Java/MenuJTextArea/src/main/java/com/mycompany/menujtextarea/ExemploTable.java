/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menujtextarea;

/**
 *
 * @author rayli
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExemploTable  extends JFrame{
    //variaveis para o uso da JTable
    private JTable table;
    private final String colunas[] = {"Nome","Idade","Sexo"};
    private final String dados[][] = {{"Charles","19","Maculino"},
                                      {"Galileu","454","Maculino"},
                                      {"Hawking","76","Maculino"},
                                      {"Newton","375","Maculino"},
                                      {"Kepler","447","Maculino"},
                                      {"Einstein","139","Maculino"},
                                      {"Copernicus","545","Maculino"}};
    
    /*COnstrutor da classe,
    antes de executar o metodo main()
    irá construir o JFrame e a JTable*/
    
    public ExemploTable(){
        setLayout(new FlowLayout());//tipo de layout
        setSize(new Dimension(600,200));//tamanho dp formulario
        setLocationRelativeTo(null);//centralizado
        setTitle("Exemplo JTable");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //intancia a JTable
        table = new JTable(dados,colunas);
        table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
        table.setFillsViewportHeight(true);
        
        //adicionando a tabela em uma barra de rolagem, ficará envolta, pela mesma
        JScrollPane scrollPane = new JScrollPane(table);
        
        //adicionando ao JFrame "Formulario" a JTable "Tabela"
        add(scrollPane);
    }
    //este é o método onde é executado nosso progarama
    
    public static void main (String[] args){
        new ExemploTable().setVisible(true);
    }
}
