import java.util.Scanner;

public class IT21156892Lab4Q2 {
    public static void main(String[]args){
        double finalMarks;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter exam marks (Out of 100) :");
        double examMarks= input.nextDouble();
        if (examMarks<0 || examMarks>100){
            System.out.print("Invalid input for exam marks. Terminating program");
            return;
        }
        System.out.print("Please enter lab submission marks (Out of 100) :");
        double labMarks= input.nextDouble();
        if (labMarks<0 || labMarks>100){
            System.out.print("Invalid input for lab submission marks.Terminating program");
            return;
        }
        System.out.print("Please enter exam percentage :");
        double examPercentage= input.nextDouble();
        System.out.print("Please enter lab submission percentage :");
        double labPercentage= input.nextDouble();
       
        
     if ((examPercentage+labPercentage)!= 100){
            System.out.print("The percentages must add up to 100. terminating program");
            return;
        }
        finalMarks=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);
        System.out.print("final exam mark is :"+finalMarks);



    }
}
