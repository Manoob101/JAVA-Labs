import java.util.Scanner;

public class IT21156892Lab9Q1{
    public static void main(String[]args){
        double x,root,root1,root2,realpart,imaginaryPart;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value a:");
        double a=input.nextDouble();
        System.out.print("Enter value b:");
        double b=input.nextDouble();
        System.out.print("Enter value c:");
        double c=input.nextDouble();

        double discreiminant= (Math.pow(b,2)) - (4*a*c);
        if (discreiminant>0){
            root1=(-b+Math.sqrt(discreiminant))/(2*a);
            root2=(-b-Math.sqrt(discreiminant))/(2*a);

            System.out.println("Roots are real and different");
            System.out.println("Root 1:"+root1);
            System.out.println("Root 2:"+root2);

        } else if(discreiminant ==0){
            root=-b/(2*a);
            System.out.println("Roots are real and same");
            System.out.println("Root :"+root);
        } else if (discreiminant<0){
            realpart=-b/(2*a);
            imaginaryPart=Math.sqrt(-discreiminant);

            System.out.println("Roots are complex and different");
            System.out.println("Real Part:"+realpart);
            System.out.println("Imaginary Part:"+imaginaryPart);

            
        }

        
    }
}