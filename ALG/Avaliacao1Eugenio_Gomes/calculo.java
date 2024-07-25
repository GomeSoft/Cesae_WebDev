import java.util.Random;
import java.util.Scanner;
class calculo
{
    Scanner scanOperacao = new Scanner(System.in);
    Scanner scanNum = new Scanner(System.in);
    calculo()
    {
         System.out.print("Digite 'soma' para somar ou outra coisa para subtrair:");
         operacao();
    }
    void operacao()
    {
        String escolha = scanOperacao.nextLine();
        
        if(escolha.equalsIgnoreCase("soma"))
        {
            System.out.print("Digite o 1º número:");
            int num1 = scanNum.nextInt();
            
            System.out.print("Digite o 2º número:");
            int num2 = scanNum.nextInt();
            
            int resultado = num1 + num2;
            
            System.out.print("O resultado da soma é: " + resultado);
            
        }
        else
        {
            System.out.print("Digite o 1º número:");
            int num1 = scanNum.nextInt();
            
            System.out.print("Digite o 2º número:");
            int num2 = scanNum.nextInt();
            
            int resultado = num1 - num2;
            
            System.out.print("O resultado da subtração é: " + resultado);
            
        }
    }
}