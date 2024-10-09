import java.util.Scanner;
public class IT21156892Lab8Q1A {
    public static void main(String[]args){
        int myArray[]= new int[5];
        int i,j;
        System.out.println("Enter 5 numbers :");
        Scanner input=new Scanner(System.in);
        for (i=0;i<myArray.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            myArray[i]=input.nextInt();
        }
        System.out.println("Array in reverse order :");

        for(j=4;j>=0;j--){
            System.out.printf(myArray[j]+" ");
        }

    }
}