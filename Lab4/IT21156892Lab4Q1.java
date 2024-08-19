import java.util.Scanner;

public class IT21156892Lab4Q1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        float number = input.nextFloat();
        if (number>0){
            System.out.print("Number is : Positive");
        }
        else if (number<0){
            System.out.print("Number is : Negative");
        }
        else if(number ==0){
            System.out.print("Number is : Zero");
        }

    }
}