import java.util.Scanner;

public class IT21156892Lab9Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter the assignment mark of " + names[i] + " (out of 100): ");
            assignmentMarks[i] = sc.nextDouble();

            System.out.print("Enter the exam mark of " + names[i] + " (out of 100): ");
            examMarks[i] = sc.nextDouble();
            sc.nextLine();

           
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrade(finalMarks[i]);
        }
        printDetails(names, finalMarks, grades);

        
    }
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    public static char findGrade(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }


    public static void printDetails(String[] names, double[] finalMarks, char[] grades) {
        System.out.println("Name  Final Mark  Grade");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"    "+finalMarks[i]+"      "+grades[i]);
        }
    }

}