import java.util.Random;
import java.util.Scanner;
class milhas 
{
    Scanner scanKm = new Scanner(System.in);
    milhas()
    {
        System.out.print("Digite quantos Km quer converter:");
        total();
    }
    void total()
    {
        float valor2 = scanKm.nextFloat();
        float res = 0.62f * valor2;
        System.out.println("O resultado da conversão para milhas é: " + res);
    }
    
}