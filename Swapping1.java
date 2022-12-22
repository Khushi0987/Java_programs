//java program using two numbers without using third variable
import java.util.Scanner;
public class Swapping {
    
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        
        System.out.println("Before Swapping the numbers:");
        System.out.println("First number = " + x);
        System.out.println(" Second number = " + y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(" After Swapping the numbers:");
        System.out.println("First number = " + x);
        System.out.println(" Second number = " + y);
    }
}
        
        
    