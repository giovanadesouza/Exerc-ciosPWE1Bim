import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Digite o número de valores que deseja consultar:");

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, cont;

        for (int i = 0; i < N; i++)
         {
        
        	cont = 0;

            System.out.println ("Por favor, digite um valor:");
        	X = leitor.nextInt();
        	
            for (int g = 2; g < X; g++) 
            {
        		if (X % g == 0) cont++;
        	}
        	
            if (cont == 0)
            System.out.println(X + " é um número primo :)"); 
        	
            else 
            System.out.println(X + " não é um número primo :(");
         }
    }
}
