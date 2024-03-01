
package controle;

import java.awt.*; //pacote exibe conteudo na janela
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import conexao.Conexao;
import javax.swing.JOptionPane;
import java.awt.event.*;

import javax.swing.table.DefaultTableModel; // para reconhecimento de JTable

import java.sql.*;

public class Dsg_Tela extends JFrame{

        Conexao con_cliente;
        JLabel rCodigo,rNome,rEmail,rTel,rData,cod,nome,dat,tele,email,imagem,pesquisar; //a partir do "cod" já começa os nomes que ficaram na tela
        JTextField tcodigo,tnome,temail, barraP; //a partir do "texto1" já começa a caixinha de escrever dentro
        JFormattedTextField tel,data;
        MaskFormatter mTel,mData;
        
        JTable tblClientes; // datagrid
        JScrollPane scp_tabela; // container para o datagrid
              
        //botoes
        JButton prim,ant,prox,ult,novoR,gravar,alt,excluir,botaoP,sair;
        
                public Dsg_Tela (){
                    
                    con_cliente = new Conexao(); // inicialização do objeto
                    con_cliente.conecta(); // chama o metodo que conecta
                    setTitle("Conexão Java com MySql");
                    Container tela= getContentPane();
                    setLayout(null);
                    setResizable(false);
                    
                    
                    //localização e os nomes que ficaram na tela
                    cod = new JLabel ("Código:");
                    nome = new JLabel ("Nome:");
                    dat = new JLabel ("Data:");
                    tele = new JLabel ("Telefone:");
                    email = new JLabel ("Email:");
                    pesquisar = new JLabel ("Pesquisar pelo nome do Cliente:");
                    
                    cod.setBounds(70,50,80,20);
                    nome.setBounds(70,80,80,20); 
                    dat.setBounds(70,130,80,20); 
                    tele.setBounds(70,160,80,20); 
                    email.setBounds(70,200,80,20); 
                    pesquisar.setBounds(488,19,200,20);
                    
                    
                    // setar e localização das caixinhas
                    tcodigo = new JTextField();
                    tnome = new JTextField();
                    temail = new JTextField();
                    barraP = new JTextField();
                    
                    tcodigo.setBounds(130,50,80,20);
                    tnome.setBounds(130,80,150,20); 
                    temail.setBounds(130,200,150,20);
                    barraP.setBounds(480,50,200,20);
                    
                    
                //fromatação dos tel e data   
                try{
        
                    mTel = new MaskFormatter("(##)####-####");
                    mData = new MaskFormatter("##/##/####");
                    
                    mTel.setPlaceholderCharacter(' ');
                    mData.setPlaceholderCharacter(' ');
                    
                }
                catch(ParseException excp){}
                
                    tel = new JFormattedTextField(mTel);
                    data= new JFormattedTextField(mData);

                    //trouxe eles para baixo porque tem que ser embaixo do try e catch quando tem ########
                    data.setBounds(130,130,70,20); 
                    tel.setBounds(130,160,100,20); 


                    // identificando, localizando os botoes e inserindo funçoes
                    prim= new JButton("Primeiro");
                    ant= new JButton("Anterior");
                    prox= new JButton("Próximo");
                    ult= new JButton("Último");
                    botaoP= new JButton("Pesquisar");
                    sair= new JButton("Sair");

                    botaoP.setBounds(525,80,100,20);
                    prim.setBounds(60,260,85,20);
                    ult.setBounds(150,260,80,20);
                    prox.setBounds(240,260,90,20);
                    ant.setBounds(335,260,90,20);
                    
                    novoR= new JButton("Novo Registro");
                    gravar= new JButton("Gravar");
                    alt= new JButton("Alterar");
                    excluir= new JButton("Excluir");
                    
                    novoR.setBounds(60,520,125,20);
                    gravar.setBounds(190,520,75,20);
                    alt.setBounds(280,520,90,20);
                    excluir.setBounds(375,520,90,20);
                    sair.setBounds(650,520,90,20);
                    
                    
                    //funções botoes de cima e baixo
                    prim.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            try {
                                con_cliente.resultset.first();
                                    mostrar_Dados();
                                
                                    
                            }catch(SQLException erro){
                                JOptionPane.showMessageDialog(null, "Não foi possivel acessar o primeiro registro" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                    
                    ult.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            try {
                                if(con_cliente.resultset.last() == true){
                                   mostrar_Dados(); 
                                }else{
                                    JOptionPane.showMessageDialog(null, "Você já está no último registro da tabela!");
                                }
                                   
                            }catch(SQLException erro){
                                JOptionPane.showMessageDialog(null, "Não foi possivel acessar o primeiro registro" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                    
                    prox.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            try {
                                if (con_cliente.resultset.next() == true){
                                    mostrar_Dados();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Você já está no último registro da tabela!");
                                }
                            }catch(SQLException erro){
                                JOptionPane.showMessageDialog(null, "Não foi possivel acessar o primeiro registro" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                    
                    ant.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            try {
                                if(con_cliente.resultset.previous()==true){
                                    mostrar_Dados();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Você já está no primeiro registro da tabela!");
                                }
                            }catch(SQLException erro){
                                JOptionPane.showMessageDialog(null, "Não foi possivel acessar o primeiro registro" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                    
                    
                    //função de limpar as caixas (registros
                    novoR.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            tcodigo.setText(""); //limpa a caixa de texto em questão
                            tnome.setText("");
                            temail.setText("");
                            tel.setText("");
                            data.setText("");
                            
                            tcodigo.requestFocus();//posiciona o cursor neste campo para digitação
                        }});
                    
                    gravar.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            String nome= tnome.getText();
                            String data_nasc= data.getText();
                            String telefone= tel.getText();
                            String email= temail.getText();
                            
                            try{ 
                                String insert_sql=  "insert into tbclientes (nome,telefone,email,dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                                con_cliente.statement.executeUpdate(insert_sql);
                                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                                con_cliente.executaSQL("select * from tbclientes order by cod");
                                preencherTabela();
                                
                            } catch (SQLException errosql){
                                JOptionPane.showMessageDialog(null, "\n Erro na Gravação :\n" +errosql, "mensagem do programa", JOptionPane.INFORMATION_MESSAGE); 
                            }
                        }});
                    
                    alt.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            String nome = tnome.getText();
                            String data_nasc = data.getText();
                            String telefone = tel.getText();
                            String email = temail.getText();
                            String sql;
                            String msg= "";
                            
                            try{
                                if(tcodigo.getText().equals("")){
                                    sql= "insert into tbclientes (nome,telefone,email,dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                                    msg= "Gravação de um Novo Registro";  
                                }else{
                                    sql= "update tbclientes set nome='" + nome + "',telefone='" + telefone + "',email='" + email + "',dt_nasc='" + data_nasc + "' where cod= " + tcodigo.getText();
                                    msg= "Alteração de registro";
                                }
                                con_cliente.statement.executeUpdate(sql);
                                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                
                                con_cliente.executaSQL("select * from tbclientes order by cod");
                                preencherTabela();
                                
                            }catch(SQLException errosql){
                                JOptionPane.showMessageDialog(null, "\n Erro na Gravação :\n" +errosql, "mensagem do programa", JOptionPane.INFORMATION_MESSAGE); 
                            
                            }
                        }});
                    
                    excluir.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            String sql= "";
                            
                            try{
                                int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
                                if (resposta==0){
                                    sql = "delete from tbclientes where cod = " + tcodigo.getText();
                                    int excluir = con_cliente.statement.executeUpdate(sql);
                                    if (excluir==1){
                                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Messagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                        con_cliente.executaSQL("select * from tbclientes order by cod");
                                        con_cliente.resultset.first();
                                        preencherTabela();
                                        posicionarRegistro();
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }catch (SQLException excecao){
                                JOptionPane.showMessageDialog(null, "Erro na exclusão:" + excecao, "Mensagem do Progama", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                
                    botaoP.addActionListener(
                            new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            try{
                                String pesquisa = "select * from tbclientes where nome like '" + barraP.getText() + "%' ";
                                con_cliente.executaSQL(pesquisa);
                                
                                if(con_cliente.resultset.first()){
                                    preencherTabela();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }catch(SQLException errosql){
                                JOptionPane.showMessageDialog(null, "\n Os dados digitados não ofram localizados!! : \n " +errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }});
                    
                    //definir imagem
                    ImageIcon iconee = new ImageIcon("src/greti.jpg"); 
                    imagem = new JLabel(iconee);
                    imagem.setBounds(385,5,400,400);
                    
                    
                    
                     //cor da minha tela
                    tela.setBackground(new Color(117, 191, 190));
                    
                    
                    
                    //configuraçaão da JTable
                    tblClientes = new javax.swing.JTable();
                    scp_tabela = new javax.swing.JScrollPane();
                    
                    tblClientes.setBounds(50,300,700,200);
                    scp_tabela.setBounds(50,300,700,200);
                    
                    tela.add(tblClientes);
                    tela.add(scp_tabela);
                    
                    tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                    tblClientes.setFont(new java.awt.Font("Arial", 1, 12));
                    
                    tblClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null,null,null,null,null},
                        {null,null,null,null,null},
                        {null,null,null,null,null},
                        {null,null,null,null,null}
                    },
                    new String [] {"Código","Nome","Data de Nascimento","Telefone","Email"})
                    {
                    boolean[] canEdit = new boolean []{
                        false,false,false,false,false };
                    
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];}
                    });
                    
                    
                    
                    scp_tabela.setViewportView(tblClientes);
                    
                    tblClientes.setAutoCreateRowSorter(true); // ativa a classificação ordenada da tabela
                    
                    //fim da configuraçãoo da jtable
                    
                    //JLabel
                    tela.add(cod); 
                    tela.add(nome); 
                    tela.add(dat); 
                    tela.add(tele); 
                    tela.add(email); 
                    tela.add(pesquisar); 
                    
                    //JTextField
                    tela.add(tcodigo); 
                    tela.add(tnome); 
                    tela.add(temail); 
                    tela.add(data); 
                    tela.add(tel); 
                    tela.add(barraP);
                    
                    //JButton
                    tela.add(prim); 
                    tela.add(ant); 
                    tela.add(prox); 
                    tela.add(ult); 
                    tela.add(novoR);
                    tela.add(gravar); 
                    tela.add(alt);
                    tela.add(excluir);
                    tela.add(botaoP);
                    tela.add(sair);
                    
                    //iamgem
                    tela.add(imagem); 
                    
                    //definir icone
                    ImageIcon icone = new ImageIcon("src/data.png"); 
                    setIconImage(icone.getImage());
                    
                    setSize(800,600);
                    setVisible(true);
                    setLocationRelativeTo(null);
                    
                    con_cliente.executaSQL("Select * from tbclientes order by cod");
                    preencherTabela();
                    posicionarRegistro();
                    
                }
                
                public void preencherTabela(){
                    tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
                    tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
                    tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
                    tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
                    tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
                    
                    DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
                    modelo.setNumRows(0);
                    
                    try {
                        con_cliente.resultset.beforeFirst();
                        while(con_cliente.resultset.next()){
                            modelo.addRow(new Object[]{
                                con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"),con_cliente.resultset.getString("email")    
                            });
                        }
                    }catch(SQLException erro){
                        JOptionPane.showMessageDialog(null, "\n Erro ao listar dados na tabela!! :\n " +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }}
                    
                    public void posicionarRegistro(){
                        try{
                            con_cliente.resultset.first(); //posiciona no 1º registro da tabela
                            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
                        }catch (SQLException erro){
                            JOptionPane.showMessageDialog(null, "Não foi possivel posicionar o 1º registro:" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        }}
                        
                        public void mostrar_Dados(){
                            try{
                                tcodigo.setText(con_cliente.resultset.getString("cod")); // associar a caixa de texto ao campo cod
                                tnome.setText(con_cliente.resultset.getString("nome")); // associar a caixa de texto ao campo nome
                                data.setText(con_cliente.resultset.getString("dt_nasc"));
                                tel.setText(con_cliente.resultset.getString("telefone"));
                                temail.setText(con_cliente.resultset.getString("email")); 
                            }catch (SQLException erro){
                                JOptionPane.showMessageDialog(null, "Não localizou os dados" +erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            }
                    }
                    
                public static void main(String args[]){
                Dsg_Tela app = new Dsg_Tela();
                app.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
}
}
