
package recursionsample1;
import java.util.Scanner;

public class RecursionSample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Int to generate Fibonacci sequence: ");
        int c = sc.nextInt();
        for(int i = 0; i<c; i++)
        {
            System.out.println(Fibonacci(i)+" ");
        }
    }
    
   
    public static void printHello(int x)
    {
        if(x>0)
        {
            System.out.println("Hello World!");
            printHello(x-1);
        }
    }
    public static int Factorial(int x)
        {
            if(x==0)
            {
            return 1;
            }
            else
            {
                
            return x * Factorial(x-1);
            
            }
        }
    public static int Fibonacci(int x)
    {
         if(x==0)
            {
            return 0;
            }
          if(x==1)
            {
                return 1;
            }
          else
          {
            return Fibonacci(x-1) + Fibonacci(x-2);
            
          }
    }
}
