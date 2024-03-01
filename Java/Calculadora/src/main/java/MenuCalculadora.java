/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//Cria a classe publica "MenuCalculadora"
public class MenuCalculadora {
    //Atributos privados
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    //metodo contrutor
    public MenuCalculadora(){
        //inicializa esses atributos com novas instâncias
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    
    //método público que não recebe nenhum parâmetro
    public void executarCalculadora(){
        //loop 
        do{
            //Executa os métodos
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao !=0);
    }
    //método privado que não recebe nenhum parâmetro
    private void executarMenuPrincipal(){
        //variavel
        String mensagemMenu = "Selecione uma opção"
                +"\n 1 - Somar"
                +"\n 2 - Subtrair"
                +"\n 3 - Multiplicar"
                +"\n 4 - Dividir"
                +"\n 5 - Sair";
        //a opção selecionada vai ser passada como parametro para "entradaDados"
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt (entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
        String saida;
        double num1 = 0, num2 = 0;
        if(this.opcao != 0 && this.opcao <= 4){
            String mensagemEntrada = "Digite o 1° numero";
            num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero01(num1);
            mensagemEntrada = "Digite o 2° numero";
            num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero02(num2);
        }
        switch(this.opcao){
            case 1:
                calculadora.somar(num1, num2);
                saida = "Resultado da soma: " + calculadora.getResultado();
                io.saidaDados (saida);
                break;
            case 2:
                calculadora.subtrair(num1,num2);
                saida = "Resultado da subtração: " + calculadora.getResultado();
                io.saidaDados (saida);
                break;
            case 3:
                calculadora.multiplicar(num1,num2);
                saida = "Resultado da multiplicação: " + calculadora.getResultado();
                io.saidaDados (saida);
                break;
            case 4:
                calculadora.dividir(num1,num2);
                saida = "Resultado da divisão: " + calculadora.getResultado();
                io.saidaDados (saida);
                break;
            case 5:
                calculadora.sair();
                break;
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
}
