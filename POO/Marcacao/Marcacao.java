import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Marcacao
{   
    Dias instanciaDias;
    Scanner scanEscolhaUsuario = new Scanner(System.in);
    Random diaAleatorio = new Random();
    ArrayList<Dias> Dias1 = new ArrayList<>();
    void marcacao()
    {
        
        System.out.println("Bem vindo ao sitema de marcação.");
        System.out.println("Pretende incluir o sábado na sua marcacação?");
        String escolha = scanEscolhaUsuario.nextLine();
        
        if(escolha.equals("Sim") == true ){
            diasIncSabado();
        }
        
        else
        {
            
        }
        
    
    }
    
    void diasIncSabado()
    {
        for(int i = 0; i <= Dias.arrayDiasIncSabado.length; i++)
        {   
            
            
        }
    }
    
    void diasExcSabado()
    {
        
    }
    
    void horario()
    {
        
    }
}