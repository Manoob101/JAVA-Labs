import java.util.Scanner;
public class IT21156892Lab9Q3 {
 public static void main(String[]args){
    double result1,result2;
    result1=square(add(multiply(3, 4),multiply(5, 7)));
    result2=add(square(add(4,7)),square(add(8,3)));
    System.out.println("Result of (3*4+5*7)^2 :"+result1);
    System.out.println("Result of (4+7)^2+(8+3)^2 :"+result2);
 }
 public static int add(int a,int b){
    return a+b;
 }  
 public static int multiply(int a,int b){
    return a*b;
 }  
 public static int square(int a){
    return a*a;
 }
}
