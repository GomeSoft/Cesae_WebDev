import java.util.Scanner;
class tabuada
{
    Scanner scanUtilizador = new Scanner(System.in);
    tabuada()
    {
           System.out.println("Digite um número para saber a sua tabuada: ");
           int num = scanUtilizador.nextInt();
           for (int i = 1 ; i <= 10; i++)
           {
               int resultado = i * num;
               System.out.println(num + "X" + i + "=" + resultado);
           }
    }
}