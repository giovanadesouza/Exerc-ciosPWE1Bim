import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner leitura = new Scanner(System.in);
        int[] N = new int[10];

        System.out.println("Digite um valor:");
        N[0] = leitura.nextInt();

        for (int i=1; i <10; i++) 
        {
            N[i] = N[i-1] * 2;
        }
        for (int i=0; i <10; i++) 
        {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
}
