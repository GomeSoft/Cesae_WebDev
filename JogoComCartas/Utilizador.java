//Extends é ima keyword que implementa o conceito de herança
//Casse mãe ou Superclasse de jogador
class Utilizador
{
    int id;
    String username;
    String email;
    String password;
    
    boolean autenticado = false;
    
    Utilizador()
    {
        username = "Visitante";
    }
    
    void fazerlogin(String paramUsername, String paramPassword)
    {
        //Supondo acesso à base de dados
        username = "Eugenio";
        password = "Gomes";
        
        if (username == paramUsername && password == paramPassword)
        {
            
            System.out.println("Acertoooouu Mizerave!!!");
        }
        else
        {
            System.out.println("Erroooooouu Pra Foraaaaaa!!!");
        }
    }
    void fazerLogout()
    {
        
    }
    void fazerRegisto()
    {
        
    }
}