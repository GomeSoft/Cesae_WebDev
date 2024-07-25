import java.util.Random;
import java.util.Scanner;
class Login
{   
    Scanner scanUser = new Scanner(System.in);
    Scanner scanPass = new Scanner(System.in);
    String username = "utilizador";
    String password = "abz";
    int tentativas = 0;
    Login()
    {
        System.out.println("Username: ");
        System.out.println("Password: ");
        dados();
        validacoes();
    }
    void dados()
    {
        String user2 =  scanUser.nextLine();
        String pass2 =  scanPass.nextLine();
        if (user2 == username && pass2 == password)
        {
            System.out.println("Acertooouuu MIZEraaaveeeeee");
        }
        else
        {
             System.out.println("Erroooouuu MIZEraaaveeeeee");
             tentativas ++;
             validacoes();
        }
        
    }
    void validacoes()
    {
        if (tentativas == 3)
        {
            
            System.out.println("Foge!");
        }
        else
        {
            dados();
        }
        
    }
}