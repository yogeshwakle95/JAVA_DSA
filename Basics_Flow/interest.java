package JAVA_DSA.Basics_Flow;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class interest {
    public static void main(String[] args){
        float P,T,R,SI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        P = sc.nextFloat();
        System.out.print("Enter the time: ");
        T = sc.nextFloat();
        System.out.print("Enter the interest rate: ");
        R = sc.nextFloat();
        SI = (P*T*R)/100;
        System.out.print("Interest Rate is: "+SI);
    }
}
