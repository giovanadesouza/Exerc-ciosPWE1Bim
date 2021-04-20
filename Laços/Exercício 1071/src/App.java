import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
    	int soma = 0;

        System.out.println("Digite o primeiro valor:");
		int Valor1 = leitura.nextInt();

        System.out.println("Digite o segundo valor:");
		int Valor2 = leitura.nextInt();

		if (Valor1 < Valor2) 
        {
			for (int i = Valor1 + 1; i < Valor2; i++) {
				if (i % 2 != 0) 
                {
					soma += i;
				}
			}
		} 
        else 
        {
			for (int i= Valor2 + 1; i < Valor1; i++)
             {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println("A soma dos números impares entre os valores é de: " + soma);
    }
}
