import java.util.Random;
import java.util.Scanner;
import java.util.Random;
class misterio
{   
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();
    boolean inicio = true;
    int EscolhaUtilizador = 0;
    int tentativas = 0;
    misterio()
    {
         geracao();
    }
    void geracao()
    {
        if (inicio == true)
        {
            System.out.println("Bem-vindo/a!");
            System.out.println("Este programa permite ecolher um número entre 2 e 8.");
            inicio = false;
        }
            
        System.out.println("Por favor escolha um número entre 2 e 8 para o sorteio");
        EscolhaUtilizador = scanNumeroUtilizador.nextInt();
        if( EscolhaUtilizador < 2 || EscolhaUtilizador > 8)
        {
           lancamento(EscolhaUtilizador);
        }
        else
        {
            System.out.println("Não escolheu um numero suportado! Tente novamente...");
            geracao();
        }
        
    }
    void lancamento(int la)
        {
            int resultado =objetoNumeroAleatorio.nextInt(EscolhaUtilizador);
            System.out.println("O resultado foi: " + resultado);
            if (EscolhaUtilizador != resultado)
            {
               System.out.println("Errou!");
               geracao();
               System.out.println("Gostaria de tentar mais uma vez? ou 'não' para encerrar o programa");
               String novaescolha = new String();
               novaescolha = scanNumeroUtilizador.nextLine();
            }
            else
            {
                System.out.println("Obrigado!!! Até a próxima.");
            }
        }
}