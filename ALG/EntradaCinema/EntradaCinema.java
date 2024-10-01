import java.util.Random;
import java.util.Scanner;
class EntradaCinema
{
    Scanner scanIdade = new Scanner(System.in);
    EntradaCinema()
    {
        System.out.println("Digite Sua Idade");
        validacao();
    }
    void validacao()
    {
        int Idade2 =  scanIdade.nextInt();
        //var.equalsIgnoreCase("norte") - assume que todas são maiusculas
        if(Idade2 >= 18)
        {
            System.out.println("Permitida a Entrada");
        }
        else
        {
            System.out.println("Proibido Entrar");
        }
    }
}