/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaimc;

/**
 *
 * @author nycol
 */
//Classe pública chamada MenuIMC
public class MenuIMC {

    //declarando variáveis de instância privadas do tipo de suas respectiveis classes
    private IMC imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Situacao situacao;

    //Método construtor onde não recebe nenhum parâmetro. 
    public MenuIMC() {
        //Cada objeto inicializa com sua respectivel classe
        this.imc = new IMC();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.situacao = new Situacao();
    }

    //Método público executarIMC()
    public void executarIMC() {
        /*estrutura de repetição do..while, onde chamará os demais métodos da 
        classe enquando a opcao for diferente diferente de 5*/
        do {
            this.executarMenuPrimcipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 5);
    }

    //Método público executarMenuPrimcipal().
    public void executarMenuPrimcipal() {

        //armazena um "menu" na variável mensagemMenu
        String mensagemMenu = "Selecione uma opção"
                + "\n1 - Cadastrar Peso e Altura"
                + "\n2 - Consultar Dados Cadastrados"
                + "\n3 - Calcular IMC"
                + "\n4 - Verificar Situação"
                + "\n0 - Sair";

        //Variável entradaDados recebe o retorno do metodo entradaDados da classe EntradaSaidaDadso
        String entradaDados = io.entradaDados(mensagemMenu);

        /*A opcao recebe a conversao do fvalor digitado por meio do método 
        stringToInt da classe ConversorNumeros*/
        this.opcao = conversor.stringToInt(entradaDados);
    }

    //método público avaliarOpcaoEscolhida()
    public void avaliarOpcaoEscolhida() {

        //Switch case usado para indentificar a opcao escolhida e sua ação
        switch (this.opcao) {

            /*Caso opcao == 1, haverá uma conversão dos valores digitados (por meio do método 
            stringToInt). Esses valores serão passados como argumento para o método cadastrarDados da classe IMC*/
            case 1:
                String mensagemPeso = "Digite o peso";
                String mensagemAltura = "Digite o altura";
                double Peso = conversor.stringToDouble(io.entradaDados(mensagemPeso));
                double Altura = conversor.stringToDouble(io.entradaDados(mensagemAltura));
                imc.cadastrarDados(Peso, Altura);
                break;

            /*
                --A partir dessse case, todos irão passar uma mensagem como argumneto para o método saidaDados--
                        
            Caso opcao == 2, é armazenado uma mensagem na variável mensagemDados que é usada como argumento
            para o método saidadados da classe EntradaSaidaDados*/
            case 2:
                String mensagemDados = "Os dados digitados são:"
                        //Getters usadso para "pegar" os valores que foram armazenados no objeto peso e altura
                        + "\n Peso: " + imc.getPeso()
                        + "\n Altura: " + imc.getAltura();
                io.saidaDados(mensagemDados);
                break;

            /*Caso opcao == 3, menagem armazenada em uma variável que já contatena o return do método 
                calcularIMC() da classe IMC*/
            case 3:
                String mensagemIMC = "O calculo do IMC é: " + imc.calcularIMC();
                io.saidaDados(mensagemIMC);
                break;

            //Caso opcao == 4:
            case 4:
                /*Estava tentando obter verificar a situacao da seguinte fomra
                String mensagemSituacao = "A situação do IMC é: " + situacao.verificarSituacao(imc); FORMA ERRADA*/

 /*FORMA CERTA
                Chama o método verificarSituacao e passa o objeto imc como argumento, logo após isto
                é armazenada uma em uma variável que já contatena o return do método
                 */
                situacao.verificarSituacao(imc); // Executa a verificação
                String mensagemSituacao = "A situação do IMC é: " + situacao.getSituacao(); // Obtém a situaçãO
                io.saidaDados(mensagemSituacao);
                break;

            //Caso opcao == 0, passa direto uma mensagem como argumento
            case 0:
                io.saidaDados("Finalizando programa!");
                break;

            //Caso opcao seja inválida, passa direto uma mensagem como argumento    
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
}
