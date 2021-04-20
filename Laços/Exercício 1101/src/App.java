import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println ("Digite dois valores:");
        int M, N;
		Scanner leitura =new Scanner(System.in);
		
		while (((M = leitura.nextInt()) > 0 )&&((N = leitura.nextInt()) > 0 )) 
        {
			int soma = 0;

			if (M > N) {
				for (N = N; N <= M; N++) {
					soma+=N;
					System.out.print(N+" ");
				}
				System.out.print("A soma entre os valores é:"+soma+"\n");
			}
            else 
            {
				for (M = M; M <= N; M++)
                {
					soma+=M;
					System.out.print(M+" ");
				}
				System.out.print("A soma entre os valores é:"+soma+"\n");
			}
    }
}
}
