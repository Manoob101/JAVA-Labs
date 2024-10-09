import java.util.Scanner;
public class IT21156892Lab8Q1B {
    public static void main(String[]args){
        int myArray[]= new int[5];
        int evenArray[] = new int[5];
        int i,j,count=0;
        System.out.println("Enter 5 numbers :");
        Scanner input=new Scanner(System.in);

        for (i=0;i<myArray.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            myArray[i]=input.nextInt();
                if(myArray[i]%2==0){
                    evenArray[count]=myArray[i];
                    count++;
                }
        }
        System.out.println("my Array contents :");

        for(j=0;j<myArray.length;j++){
            System.out.print(myArray[j]+" ");
        }
        System.out.println();
       
        System.out.println("evenArray contents :");
        
        for(int l=0;l<evenArray.length;l++){
            System.out.print(evenArray[l]+" ");
        }
    }
}