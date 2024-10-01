import java.util.Scanner;
import java.util.Random;
class classeB
{
    int restime1 = 0;
    int restime2 = 0;
    Random ScanNum = new Random();
    String clube;
    classeB()
    {
        Scanner scanTimeUtilizador = new Scanner(System.in);
        System.out.println("Digite o seu team: ");
        clube = scanTimeUtilizador.nextLine();
        time();
    }
    void time()
    {
        int num1 = ScanNum.nextInt(5);
        System.out.println("O " + clube + " marcou " + num1 + " golos.");
        int num2 = ScanNum.nextInt(5);
        System.out.println("O Adversário marcou " + num2 + " golos.");
        if(num1 > num2){
            System.out.println("O " + clube + " Ganhou!!! ");
        }else if(num1 < num2){
            System.out.println("O " + clube + " Perdeu!!! ");
        }else{
            System.out.println("O " + clube + " Empatou!!! ");
        }
    }
    
}