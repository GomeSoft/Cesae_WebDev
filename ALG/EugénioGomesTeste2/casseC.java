import java.util.Scanner;
import java.util.Random;
class casseC
{   
    int num;
    int contador;
    int n = 1;
    Random ScanNum = new Random();
    casseC()
    {
        Scanner scanUtilizador = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7: ");
            num = scanUtilizador.nextInt();
        while (num < 1 || num > 7){
            System.out.println("Número Inválido! ");
            System.out.println("Digite novamente um número entre 1 e 7: ");
            num = scanUtilizador.nextInt();
        }
        aleatorios();
    }
    void aleatorios()
    {
        
        for(int i = 0; i < num; i++)
        {
            int num1 = ScanNum.nextInt(21);
            System.out.println("O " + n + "º número aleatório é: "+num1);
            n = n + 1;
            contador = contador + num1;
        }
        System.out.println("O Somatório deles é " + contador);
    }
}