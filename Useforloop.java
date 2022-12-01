import java.util.Scanner;
class Sumuser
{
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter value of x ");
      int x=obj.nextInt();
      System.out.println("Enter value of y ");
      int y=obj.nextInt();
      int sum=0;
      sum=x+y;
      System.out.println("Sum of two numbers x and y is " + sum);
    }
}