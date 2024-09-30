import java.util.Scanner;
public class IT21156892Lab6Q3 {
    public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    int num=0,count=0;
    double RMS,sum=0;
    while(num != -99){
        
        System.out.print("Enter a number :");
        num=input.nextInt();
        count++;
            if (num <0){
                if(num==-99){
                    break;
                } else {
                System.out.print("Invalid input.Please enter a positive integer or -99 to terminate");
                }
            }
            sum=sum + Math.pow(num,2);
    }

    double ans=sum/count;
    RMS=Math.sqrt(ans);
    System.out.print("Root Mean Square (RMS) is :"+ans);
}
}
