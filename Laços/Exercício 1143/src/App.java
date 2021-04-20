import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
    	int x, y;
        
        System.out.println ("Digite um valor:");
		x = entrada.nextInt();

		for (y=1; y <= x; y++) 
        {
			System.out.print(y + " ");
			System.out.print(y*y + " ");
			System.out.println(y*y*y);
		}

    }
}
