import java.util.Scanner;
public class IT21156892Lab3Q1B{


    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice :");
        int priceOfOneKilo = input.nextInt();
        System.out.print ("Enter the number of kilograms you want to buy :");
        int numberOfKilo = input.nextInt();
        float total = priceOfOneKilo*numberOfKilo;
        total = total-(total/10);
        System.out.println("The total amount with 10% discount is:"+total);
    }
}