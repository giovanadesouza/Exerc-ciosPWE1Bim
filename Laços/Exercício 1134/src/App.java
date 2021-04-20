import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, tipocombustivel = 0;

		while (tipocombustivel != 4) 
        {
            System.out.println ("Digite o código:");
			tipocombustivel = ler.nextInt();

			while (tipocombustivel < 1 || tipocombustivel > 4) 
            {
				tipocombustivel = ler.nextInt();
			}
			
            switch (tipocombustivel) 
            {
                
				case 1: alcool++; 
                break;
				case 2: gasolina++; 
                break;
				case 3: diesel++; 
                break;
			}
		}

		System.out.println("Qtd. Alcool: " + alcool);
		System.out.println("Qtd. Gasolina: " + gasolina);
		System.out.println("Qtd. Diesel: " + diesel);
        System.out.println("Obrigado pela colaboração ;)");
    }
}
