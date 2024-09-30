import java.util.Scanner;
public class IT21156892Lab5Q3 {
 public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int startDate,endDate,numofdays;
    double totalAmount,discount,roomCharge;
    discount=0;
    System.out.print("Enter Start date (1-31) :");
    startDate=input.nextInt();
    System.out.print("Enter end date (1-31) :");
    endDate =input.nextInt(); 
    if (startDate<1 || startDate>31){
        System.out.println("Error: days must be between 1 and 31");
        return;
        }

    if (endDate<1 || endDate>31){
        System.out.println("Error: days must be between 1 and 31");
        return;
        }
    if (endDate<=startDate){
        System.out.println("Start date must be less than end date");
        return;
    }
    numofdays=endDate-startDate;
    roomCharge=48000.0;
    if (numofdays>=3 && numofdays<5){
        discount=0.1;
    }
    else if (numofdays>=5){
        discount=0.2;
    }
totalAmount= numofdays*roomCharge;
totalAmount=totalAmount-(totalAmount*discount);
System.out.println("Room charge per day : Rs."+roomCharge+"/="); 
System.out.println("Number of days reserved :"+numofdays);
System.out.println("Total amout to be paid :"+totalAmount);
}   

}
