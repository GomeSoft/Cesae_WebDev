import java.util.Scanner;
class cicloWhile
{
    cicloWhile()
    {
        Scanner scanUtilizador = new Scanner(System.in);
        System.out.println("Digite um número entre 30 e 40: ");
           int num = scanUtilizador.nextInt();
           //While repete sempre que a condi~ção for verdadeira
        //while( num < 30 || num > 40)
        //{
        //    System.out.println("ERROU MIZERAVEEE! ");
        //    System.out.println("Digite novamente um número entre 30 e 40: ");
        //    num = scanUtilizador.nextInt();
            do
        {
            num = scanUtilizador.nextInt();
            if ( num < 30 || num > 40){
            System.out.println("MIZERAVEEE! ");
            System.out.println("ERROU MIZERAVEEE! ");
            System.out.println("Digite novamente um número entre 30 e 40: ");
            }
        }while(num < 30 || num > 40);
    }
        
        //"do while" Executa pelo menos uma vez o código, só testa o código depois da primeira interação
        //
    
}
