import java.util.Random;
class ex01
{
    Random ScanNum = new Random();
    ex01()
    {
        System.out.println("Este programa vai gerar 75 números aleatórios: ");
        for(int i = 0; i<74; i++)
        {  
            int num = ScanNum.nextInt(101);
            int posicao = i + 1;
            System.out.println("o aletorio nº "+ posicao + "é: " + num);
        }
    }
}