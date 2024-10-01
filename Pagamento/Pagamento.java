import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Pagamento 
{
    ArrayList<Integer> Preco;
    Random valorAleatorio = new Random();
    Scanner scanEscolhaUsuario = new Scanner(System.in);
    Scanner scanAumentoUsuario = new Scanner(System.in);
    void Pagamento()
    {
        Preco = new ArrayList();
        for(int i=0; i<20; i++)
        {
            Preco.add(i+1);
        }
        
        for(int i=0; i<1; i++)
        {
            int indexSorte = valorAleatorio.nextInt( Preco.size() );
            System.out.println(Preco.get(indexSorte));
            System.out.println("Quanto dinheiro vai entregar? ");
            int escolha = scanEscolhaUsuario.nextInt();
            if (escolha == Preco.get(indexSorte))
            {
                System.out.println("Compra efectuada!");
            }
            else if(escolha > Preco.get(indexSorte)){
                int troco = escolha - Preco.get(indexSorte);
                System.out.println("Compra efectuada! o seu troco é de: "+ troco);
            }
            else if(escolha < Preco.get(indexSorte)){
                System.out.println("O seu dinheiro não é suficiente!");
                System.out.println("Quanto dinheiro vai aumentar? ");
                    int escolha2 = scanAumentoUsuario.nextInt();
                    int resultado = escolha + escolha2;
                if (resultado >= Preco.get(indexSorte)){
                            System.out.println("Compra efectuada! o seu troco é de: " + (escolha + escolha2 - Preco.get(indexSorte)) );
                }
                while (resultado < Preco.get(indexSorte))
                {
                    
                        System.out.println("O seu dinheiro ainda não é suficiente!");
                        System.out.println("Quanto dinheiro vai aumentar? ");
                        escolha2 = scanAumentoUsuario.nextInt();
                        resultado = escolha + escolha2;
                        if (resultado > Preco.get(indexSorte)){
                            System.out.println("Compra efectuada! o seu troco é de: " + (resultado - Preco.get(indexSorte)) );
                        }
                        else if(resultado == Preco.get(indexSorte)){
                            System.out.println("Compra Efectuada!2");
                        }
                        else{
                            System.out.println("Compra efectuada!!!");
                        }
                        resultado = resultado + escolha2;
                }
                
            }
                
        }
    }
            
}

