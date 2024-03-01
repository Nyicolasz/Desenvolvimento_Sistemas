/**
 *
 * @author Nycolas
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDeBarraDeFerramenta extends JFrame{
    JToolBar barra;
    JButton direita,esquerda,centralizar,recortar,copiar,colar;
    ImageIcon imagens[];
    
    public ExemploDeBarraDeFerramenta(){
        super("Exemplo de Barra de Ferramentas");
        Container tela = getContentPane();
        tela.setBackground(Color.yellow);
        tela.setLayout(null);
        
        String icones[]={"Icones/direita.gif","Icones/esquerda.gif",
            "Icones/centro.gif","Icones/recortar.gif",
            "Icones/copiar.gif","Icones/colar.png"};
        imagens = new ImageIcon[6];
        for(int i = 0;i < 6;i++){
            imagens[i] = new ImageIcon(icones[i]);}
        
        direita = new JButton(imagens[0]);
        esquerda = new JButton(imagens[1]);
        centralizar = new JButton(imagens[2]);
        copiar = new JButton(imagens[4]);
        colar = new JButton(imagens[5]);
        
        direita.setToolTipText("Direita (ctrl+d)");
        esquerda.setToolTipText("Esquerda (ctrl+e)");
        centralizar.setToolTipText("Centralizar (ctrl+z)");
        recortar.setToolTipText("Recortar (ctrl+x)");
        copiar.setToolTipText("Copiar (ctrl+c)");
        colar.setToolTipText("Colar (ctrl+v)");
        direita.setToolTipText("Barra de Ferramentas");
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);
        
        }
    }