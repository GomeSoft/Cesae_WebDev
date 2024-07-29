import java.util.Scanner;
class classeA
{
    
    classeA()
    {
        Scanner scanIdadeUtilizador = new Scanner(System.in);
        System.out.println("Digite a sua idade ");
           int idadeatual = scanIdadeUtilizador.nextInt();
        if (idadeatual < 18){
            int idadefalta = 18 - idadeatual;
            System.out.println("Ainda não tens idade suficiente para tirar a carta!");
            System.out.println("Faltam " + idadefalta + " ano/s para poder tirar a carta.");
        }
        else{
            System.out.print("Já pode tirar a carta!");
        }
    }
}