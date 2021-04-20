import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception 
    {

        Scanner entrada = new Scanner(System.in);
    	int x=-1;
    	double r;
    	
    	while (x <= 99) 
        {
    		r = entradanextInt();

    		if (r <= 10) 
        {
	    	System.out.println("A[" + r + "] = " + x);
    	}
    		x++;
        }
    }
}


