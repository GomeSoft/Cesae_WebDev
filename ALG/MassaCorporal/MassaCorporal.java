import java.util.Random;
import java.util.Scanner;
class MassaCorporal
{   
    Scanner scanPeso = new Scanner(System.in);
    Scanner scanAltura = new Scanner(System.in);
    MassaCorporal()
    {
        System.out.println("Qual é o seu peso? ");
        float peso2 =  scanPeso.nextFloat();
        System.out.println("Qual é a sua altura? ");
        float altura2 =  scanAltura.nextFloat();
        float res = peso2/(altura2 * altura2);
        System.out.println("O seu indice de massa corporal é " + res);
    }
    
}