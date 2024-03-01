/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menujtextarea;

/**
 *
 * @author Admin
 */



//Importando classes, atributos, etc especificos
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ExemploMeunu05 extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,cor,estilo,tamanho;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
    JCheckBoxMenuItem nomeE[];
    ButtonGroup grupoT, grupoE;
    JRadioButtonMenuItem tamanhoF[];
    String tam[] = {"12","13","16","18"};
    String est[] = {"Normal", "Negrito", "Itálico","Negrito e Itálico"};
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    int estilofonte, tamfonte;
    
    public ExemploMeunu05(){
      super("Exemplo de Menus executando ações");
      Container tela = getContentPane();
      tela.setLayout(null);
      estilofonte = Font.PLAIN;
      tamfonte = 12;
      barra = new JMenuBar();
      setJMenuBar(barra);
      opcoes = new JMenu ("Opcôes");
      barra.add(opcoes);
      
      limpar = new JMenuItem("Limpar");
      fonte = new JMenu ("Fonte");
      cor = new JMenu ("Cor");
      azul = new JMenuItem ("Azul");
      verde = new JMenuItem ("Verde");
      vermelho = new JMenuItem ("Vermelho"); 
      amarelo = new JMenuItem ("Amarelo");
      preto = new JMenuItem ("Preto");
      TratadorE tratestilo = new TratadorE();
      estilo = new JMenu("Estilo");
      grupoE = new ButtonGroup();
      nomeE = new JCheckBoxMenuItem[4];
      
      for (int i=0; i < 4; i++){
          nomeE[i] = new JCheckBoxMenuItem(est[i]);
          estilo.add(nomeE[i]);
          grupoE.add(nomeE[i]);
          nomeE[i].addItemListener(tratestilo); }
      
      TratadorT trattamento = new TratadorT();
      tamanho = new JMenu("Tamanho");
      grupoT = new ButtonGroup();
      tamanhoF = new JRadioButtonMenuItem[4];
      
      for(int i = 0; i < 4; i++){
          tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
          tamanho.add(tamanhoF[i]);
          grupoT.add(tamanhoF[i]);
          tamanhoF[i].addItemListener(trattamento);
      }
      
      sair = new JMenuItem("Sair");
      
      opcoes.setMnemonic(KeyEvent.VK_O);
      limpar.setMnemonic(KeyEvent.VK_L);
      fonte.setMnemonic(KeyEvent.VK_F);
      sair.setMnemonic(KeyEvent.VK_S);
      cor.setMnemonic(KeyEvent.VK_C);
      estilo.setMnemonic(KeyEvent.VK_E);
      tamanho.setMnemonic(KeyEvent.VK_T);
      
      opcoes.add(limpar);
      opcoes.add(fonte);
      opcoes.addSeparator();
      opcoes.add(sair);
      cor.add(azul);
      cor.add(verde);
      cor.add(vermelho);
      cor.add(amarelo);
      cor.add(preto);
      fonte.add(cor);
      fonte.add(estilo);
      fonte.add(tamanho);
      
      texto = new JTextArea (10,20);
      rolagem = new JScrollPane(texto);
      rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      painel = new JPanel();
      painel.add(rolagem);
      painel.setBounds(30,30,250,250);
      tela.add(painel);
      
      limpar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setText("");
            texto.requestFocus();
        }
      }
      );

      verde.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setForeground(Color.green);
            repaint();
        }
      }
      );
      
      vermelho.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setForeground(Color.red);
            repaint();
        }
      }
      );
      
      amarelo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setForeground(Color.yellow);
            repaint();
        }
      }
      );
      
      preto.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setForeground(Color.black);
            repaint();
        }
      }
      );
      
       azul.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto.setForeground(Color.blue);
            repaint();
        }
      }
      );
      
      sair.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int resposta;
            resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?", 
                    "Mensagem do Programa", JOptionPane.YES_NO_OPTION);
            if(resposta == 6){
                System.exit(0);
            }
        }
      }
      );
      
      setSize(500,300);
      setLocationRelativeTo(null);
      setVisible(true);
      
   }
    
    public static void main (String args[]){
        ExemploMeunu05 app = new ExemploMeunu05();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class TratadorE implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(nomeE[0].isSelected()){
                estilofonte = Font.PLAIN;
            }
            if(nomeE[1].isSelected()){
            estilofonte = Font.BOLD;
            }
            if(nomeE[2].isSelected()){
                estilofonte = Font.ITALIC;
            }
            if(nomeE[3].isSelected()){
            estilofonte = Font.BOLD+Font.ITALIC;
            }
        }
    }
    
    private class TratadorT implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            
            if(nomeE[0].isSelected()){
                tamfonte = 12;
            }
            if(nomeE[1].isSelected()){
                tamfonte = 14;
            }
            if(nomeE[2].isSelected()){
                tamfonte = 16;
            }
            if(nomeE[3].isSelected()){
                tamfonte = 18;
            }
            
            texto.setFont(new Font("", estilofonte, tamfonte));
            repaint();
        }
    }
    
}
