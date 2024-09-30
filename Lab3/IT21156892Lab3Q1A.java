import java.util.Scanner;
public class IT21156892Lab3Q1A{


    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice :");
        int priceOfOneKilo = input.nextInt();
        System.out.print ("Enter the number of kilograms you want to buy :");
        int numberOfKilo = input.nextInt();
        int total = priceOfOneKilo*numberOfKilo;
        System.out.println("The total amount is :"+total);
    }
}