import java.util.Scanner;
public class Sumofnum {
    
    public static void main(String[] args)
    {
        int i, n, sum=0;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number: ");
            n= in.nextInt();
            System.out.println("First n natural numbers are :"+n);
            for(i=0;i<=n;i++)
            {
                System.out.println(i);
                sum+=i;
            }
            System.out.println("Sum of Natural numbers "+ sum);
        }
    
    }  
}