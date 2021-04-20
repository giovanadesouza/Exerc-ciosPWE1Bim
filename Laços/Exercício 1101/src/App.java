import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while(x != 0 && y != 0) {
		
			int menor, maior;
		
			if(x > y) {
				menor = y;
				maior = x;
			} else {
				menor = x;
				maior = y;
			}
		
			int soma = 0;
			for(int i = menor ; i <= maior ; i++) {
				System.out.print(i + " ");
				soma += i;
			}
		
			System.out.println("A soma dos valores = " + soma);
			
			x = scan.nextInt();
			y = scan.nextInt();
    }
}