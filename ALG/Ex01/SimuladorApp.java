//importação da classe que nos permite gerar números aleatórios
import java.util.Random;

//importação da classe que nos permite receber input do utilizador
import java.util.Scanner;


class SimuladorApp
{
    // Variáveis globais da classe, também denominadas de propriedades ou atributos
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();
    
    // Variável de controlo
    boolean comecouPrograma = true;

    SimuladorApp()
    {
        pedidoLancamento();
    
    }
    
    void pedidoLancamento()
    {
        if(comecouPrograma == true)
        {
            System.out.println("Bem-vindo/a ao Simulador de Lançamentos!");
            System.out.println("Este programa permite lançar dados de 4 ou 6 ou 8 lados.");
            comecouPrograma = false;
        }
        
        
        System.out.println("Por favor escreva 4 ou 6 ou 8 para determinar o gênero de dado a lançar:");
        
        // Guardar valor que o utilizador escreveu
        int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        if( valorUtilizadorGuardado == 4 || valorUtilizadorGuardado == 6 || valorUtilizadorGuardado == 8)
        {
            escreveResultado(valorUtilizadorGuardado);
        }
        else
        {
            System.out.println("Não escolheu um gênero de dado suportado! Tente novamente...");
            pedidoLancamento();
        }
        
        
    }
    
    void escreveResultado(int generoDeDadoALancar)
    {
       int resultadoDoLancamento =  objetoNumeroAleatorio.nextInt(generoDeDadoALancar) + 1;
       System.out.println("O resultado do lançamento foi: " + resultadoDoLancamento);
       System.out.println("Gostaria de lançar mais uma vez? ou 'não' para encerrar o programa");
       
       String escritaUtilizador = new String();
       
       //scanNumeroUtilizador.nextçone();
       
       escritaUtilizador = scanNumeroUtilizador. nextLine();
       if(escritaUtilizador.equalsIgnoreCase("sim") == true) //if(escritaUtilizador.equals("sim"))
       {
           pedidoLancamento();
        }
        else
        {
            System.out.println("Obrigado por utilizar o nosso simulador.");
            //escritaUtilizador.Close();
        }
    }
    //Pesquisar: scanner, next line, next int



}