import java.util.Scanner;

public class App
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int N = leitor.nextInt();

        int[] X = new int[N];
        int menorvalor = 0, posicaoM = 0;

        for (int i = 0; i < N; i++) 
        {
        	X[i] = leitor.nextInt();

        	if (i == 0) 
            {
        		menorvalor= X[i];
        		posicaoM = i;
        	} 
            else if (X[i] < menorvalor) 
            {
        		menorvalor = X[i];
        		posicaoM = i;
        	}
        }
        System.out.println("O menor valor é: " + menorvalor);
        System.out.println("Este se encotra na posição: " + posicaoM);
    }
}
