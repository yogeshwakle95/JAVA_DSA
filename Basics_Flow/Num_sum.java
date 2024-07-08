package JAVA_DSA.Basics_Flow;
import java.util.Scanner;

// Java Program That Takes Two Numbers As Input And Prints Their Sum

public class Num_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = sc.nextInt();
        int sum = firstNum+secondNum;
        System.out.print("The sum of number is : "+sum);

    }
}
