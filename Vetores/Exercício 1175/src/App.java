import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner entrada = new Scanner(System.in);
    	int x, i;

        System.out.println("Digite os valores:");
    	int v[] = new int[20];

        for (i=0; i <= 19; i++) {
            v[i]=i+1;
        }

        for (i=0; i <= 19; i++) {
            x = v[i];
            v[i] = v[19-i];
            v[19-i] = x;
        }

        for (i=0; i <= 19; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        }
    }
}

