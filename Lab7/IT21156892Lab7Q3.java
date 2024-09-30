import java.util.Scanner;
public class IT21156892Lab7Q3 {
    public static void main(String[]args){
        int count=1;
        float discount,total;
        char mode;
        Scanner input= new Scanner(System.in);

        while (count<=5){

            System.out.println("Customer "+count);
            count++;
            System.out.print("Enter total bill amount :");
            total=input.nextFloat();
            System.out.print("Enter mode of (C for cash, O for other) :");
            mode=input.next().charAt(0);
            if ((mode=='C')||(mode=='c')){
                discount=total*5/100;
                total=total-discount;
                System.out.println("amount to be paid :"+total);
            }
            else if ((mode=='O')||(mode=='o')){
                System.out.println("No discount applicable");
                System.out.println("amount to be paid :"+total);
            } else {
                System.out.println("Payment mode is invalid");
                continue;
            }
        
    }
}
    
}
