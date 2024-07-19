import java.util.Random;
import java.util.Scanner;
class TotalMinutos
{
    Scanner scanDiasdigitados = new Scanner(System.in);
    TotalMinutos()
    {
        System.out.println("Fornaça o número de dias para saber os minutos:");
        conversor();
    }
    
    void conversor()
    {
        int minutosDia = 1440;
        int dias =  scanDiasdigitados.nextInt();
        int m = minutosDia * dias;
        System.out.println("O número total de minutos é: ");
        System.out.println(m);
        
    }
    
} 