import java.util.Random;
import java.util.Scanner;
class Aventura
{
    Scanner scanEscolha = new Scanner(System.in);
    Aventura()
    {
        System.out.println("Eugénio encontra-se Perdifo nos aliados!");
        System.out.println("Que direção ele deve seguir para chegar ao Hospital São João?");
        System.out.println("Escolha entre (norte, sul, este e oeste)");
        condicoes();
    }
    void condicoes()
    {   
        String direcao =  scanEscolha.nextLine();
        if(direcao.equalsIgnoreCase("norte"))
        {
            System.out.println("Ele chegará");
        }
        else if(direcao.equalsIgnoreCase("sul"))
        {
            System.out.println("Ele está a ir na direção oposta");
        }
        else if(direcao.equalsIgnoreCase("este"))
        {
            System.out.println("Ele não chegará");
        }
        else if(direcao.equalsIgnoreCase("oeste"))
        {
            System.out.println("Ele irá se perder");
        }
    }
}