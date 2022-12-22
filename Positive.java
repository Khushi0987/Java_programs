import java.util.Scanner;
public class Positive {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int in = input.nextInt();
        
        if(in > 0)
        {
            System.out.println("Number is Positive");
        }
        else
         {
                System.out.println("Number is Negative");
            }
        }
    }
    