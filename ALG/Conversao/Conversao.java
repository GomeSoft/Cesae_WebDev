import java.util.Random;
import java.util.Scanner;
class Conversao
{
    Scanner scanValor = new Scanner(System.in);
    Conversao()
    {
        System.out.println("Digite quantos euros quer converter: ");
        total();
    }
        //var.equals("norte")
    void total()
    {
       float valor2 = scanValor.nextFloat();
       float res = 6.04f * valor2;
        System.out.println("O valor em reais é: " + res);
        
    }
    }
