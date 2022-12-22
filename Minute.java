import java.util.Scanner;
public class Minute {
    public static void main(String[] args){
        
        double minuteinYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes ");
        double min = input.nextDouble();
        int days = (int) (min /60 /24) % 365;
        long years = (long) (min/minuteinYear);
        System.out.println((int) min + " minutes is approximtely " + years + " years and "  +days + " days ");   
        
    }
}