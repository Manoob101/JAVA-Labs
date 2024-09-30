import java.util.Scanner;
public class IT21156892Lab3Q3{
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rupee amount :");
        int amount=input.nextInt();
        int count = amount/5000;
        amount %= 5000;
        System.out.println("5000 Notes -"+count);
        count = amount/1000;
        amount %= 1000;
        System.out.println("1000 Notes -"+count);
        count = amount/500;
        amount %= 500;
        System.out.println("500 Notes -"+count);
         count = amount/100;
        amount %= 100;
        System.out.println("100 Notes -"+count);
         count = amount/50;
        amount %= 50;
        System.out.println("50 Notes -"+count);
         count = amount/10;
        amount %= 10;
        System.out.println("10 Coins -"+count);
        count = amount/5;
        amount %= 5;
        System.out.println("5 Coins -"+count);
        count = amount/2;
        amount %= 2;
        System.out.println("2 Coins -"+count);
         count = amount;
        amount %= 1;
        System.out.println("1 Coins -"+count);

    }
}
   