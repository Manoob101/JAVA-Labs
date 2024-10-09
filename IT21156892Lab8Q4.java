import java.util.Scanner;

public class IT21156892Lab8Q4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int stdid,searchID;
        int studentsArray[]= new int[8]; 
        for (int i=0;i<studentsArray.length;i++){
            System.out.print("Enter student id for student "+(i+1)+":");
            stdid = input.nextInt();
            if (stdid>0){
                studentsArray[i]=stdid;
            }
            else {
                System.out.println("Error: please enter only positive number");
                i--;
            }
        }
        System.out.print("Enter a student ID to search :");
        searchID=input.nextInt();
        boolean isAvailable=false;
        for(int j=0;j<studentsArray.length;j++){
            if (studentsArray[j]==searchID){
                isAvailable=true;
            }
        }
        if (isAvailable==true){
            System.out.println("Student is Available");

        } else {
            System.out.println("Student is not Available");
        }
        

    }
}
