class ExemplosA
{
    String username = new String("abc");
    String password = new String("xyz");
    ExemplosA()
    {
        if (username.equals("abc") == true && password.equals("xyz") == true)
        {
             System.out.println("Username e pass corretas!");
             
        }
        else{ System.out.println("Alguma coisa FALHOU!!!");}
        //&& tem precedência nos operadores lógicos
    }
    
}