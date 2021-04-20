import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;

		while (tipo != 4) 
        {
            System.out.println ("Digite o código:");
			tipo = ler.nextInt();

			while (tipo < 1 || tipo > 4) 
            {
				tipo = ler.nextInt();
			}
			
            switch (tipo) 
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
