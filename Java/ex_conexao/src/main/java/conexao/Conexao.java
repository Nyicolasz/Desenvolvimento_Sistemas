






package conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver"; // definicao de driver mysql para acesso de dados
    final private String url = "jdbc:mysql://localhost/clientes"; // acesso ao bd "clientes" no servidor (myadmin)
    final private String usuario = "root"; // usuario do mysql
    final private String senha = ""; // senha do mysql
    private Connection conexao; // variavel que armazenará a conexão aberta
    public Statement statement; // varíavel para executação dos comandos SQL dentro do ambiente Java
    public ResultSet resultset; // variavel que armazenará o resultado da execução de um comando SQL
    
    
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado" +Driver, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "FOnte de dados não localizada" +Fonte, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
        }
    
    public void desconecta(){
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexao com o banco fechada","Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){
            JOptionPane.showMessageDialog(null, "Erro ao fechar o banco", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void executaSQL(String sql){
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch (SQLException  excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
