import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        double[] n = new double[100];
		Scanner ler = new Scanner(System.in);
		
		n[0] = ler.nextDouble();
		
		for(int i = 1 ; i < n.length ; i++) 
        {
			n[i] = n[i - 1] / 2;
			System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}