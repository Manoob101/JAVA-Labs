import java.util.Scanner;
import java.lang.Math;

public class IT21156892Lab6Q1{
    public static void main (String[]args){
        double square,squareRoot;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number :");
        double number=input.nextDouble();
        square=number*number;
        squareRoot=Math.sqrt(number);
        System.out.println("The sqare of"+number+"is :"+square);
        System.out.print("The sqare of"+number+"is :"+squareRoot);

    }
}