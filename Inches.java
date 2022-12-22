import java.util.Scanner;
public class Inches{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter into inches: ");
        double inch = input.nextDouble();
        double meters =inch * 0.0254;
        System.out.println(inch + "inch is meters"+ meters);
    }
}