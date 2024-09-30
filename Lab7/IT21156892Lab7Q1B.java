import java.util.Scanner;
public class IT21156892Lab7Q1B{

    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int mark1,mark2,mark3,mark4,count=1;
        float average;

    while(count<=3)
    { 
        System.out.println("Student "+count);
        count++;
        System.out.print("Enter Marks :");
        mark1=input.nextInt();
        System.out.print(" ");
        mark2=input.nextInt();
        System.out.print(" ");
        mark3=input.nextInt();
        System.out.print(" ");
        mark4=input.nextInt();
        average=(mark1+mark2+mark3+mark4)/4;
        System.out.println("Average is :"+average);
        if (average<=100 && average>=75){
            System.out.println("Overall Grade is :Distinction");
        }
        else  if (average<=74 && average>=50){
            System.out.println("Overall Grade is :Credit");
        }
        else if (average<=49 && average>=0){
            System.out.println("Overall Grade is : Fail");

        }
        else {
            System.out.print("Invalid marks");
        }

    }
        

    } 
}