import java.util.ArrayList;
import java.util.Random;

class SalaJogoPoker
{   

    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    int numeroIdentificadorDeControlo = 0;
    
    
    Carta instanciaCarta;
    Random valorAleatorio = new Random();
    //Criação de um ArrayList, que é uma coleção de elementos dinâmica
    ArrayList<Carta> baralho;
    
    SalaJogoPoker()
    {
        listaJogadores = new ArrayList<>();
    }
    
    void adicionarJogador()
    {
        numeroIdentificadorDeControlo ++;
        jogadorPoker = new Jogador();
        jogadorPoker.nomeNoJogo = "Gomito_"+ numeroIdentificadorDeControlo;
        listaJogadores.add(jogadorPoker);
        
        System.out.println("Entrou na sala o: " + jogadorPoker.nomeNoJogo);
    }
    
    void contarJogadores()
    {
        
        if (listaJogadores.size() == 0){
            System.out.println("A lista está vazia MIZERAVEEEEEEE!!!");
        }
        else{
            System.out.println("Existem " + listaJogadores.size() + " na sala");
            System.out.println("Que são: ");
            for(int i =0; i < listaJogadores.size(); i++)
            {
                System.out.println(listaJogadores.get(i).nomeNoJogo);
            }
        }
        
    }
    
    void criarBaralho()
    {
        baralho = new ArrayList<>();
        for(int i=0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j=0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCarta = new Carta(i, j);
                System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
                baralho.add(instanciaCarta);
            }
        }
        
    }
    
    void floop()
    { 
        for(int j=0; j < 3; j++)
        {
            int naipeAleatorio = valorAleatorio.nextInt(3);
            int rankAleatorio = valorAleatorio.nextInt(3);
            instanciaCarta = new Carta(naipeAleatorio, rankAleatorio);
            System.out.println("# cartas à sorte em baixo:");
            System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
        }
        
    }
}
