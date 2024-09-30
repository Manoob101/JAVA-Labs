import java.util.Scanner;
public class IT21156892Lab7Q1A{

    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int mark1,mark2,mark3,mark4;
        float average;
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1 :");
        mark1=input.nextInt();
        System.out.print("Enter Subject Mark 2 :");
        mark2=input.nextInt();
        System.out.print("Enter Subject Mark 3 :");
        mark3=input.nextInt();
        System.out.print("Enter Subject Mark 4 :");
        mark4=input.nextInt();
        average=(mark1+mark2+mark3+mark4)/4;
        System.out.println("Average is :"+average);
        if (average<=100 && average>=75){
            System.out.print("Overall Grade is :Distinction");
        }
        else  if (average<=74 && average>=50){
            System.out.print("Overall Grade is :Credit");
        }
        else if (average<=49 && average>=0){
            System.out.print("Overall Grade is : Fail");

        }
        else {
            System.out.print("Invalid marks");
        }


        

    } 
}