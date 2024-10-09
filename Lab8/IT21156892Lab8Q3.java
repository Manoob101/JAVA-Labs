import java.util.Scanner;

public class IT21156892Lab8Q3 {
    public static void main(String[] args) {
        int myArray[] = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter a positive number (" + (i + 1) + "/6): ");
            int value = input.nextInt();

           
            if (value > 0) {
                myArray[i] = value;
            } else {
                System.out.println("Error: Please enter a positive number.");
                i--;
            }
        }

        int maxNumber = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNumber) {
                maxNumber = myArray[i];
            }
        }

        System.out.println("The maximum number is: " + maxNumber);
    }
}

