import java.util.Scanner;
public class IT21156892Lab3Q2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary :");
        int monthlySalary = input.nextInt();
        System.out.print("Enter number of OT hours :");
        int OThours = input.nextInt();
        System.out.print("Enter the OT hourly rate :");
        int OTrate = input.nextInt();
        double OTamount = OThours*OTrate;
        double totalSalary = monthlySalary+OTamount;
        System.out.print("The total salary including OT is :"+totalSalary);



    }
    
}
