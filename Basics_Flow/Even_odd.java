package JAVA_DSA.Basics_Flow;
// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.print(number + ":  number is Even");
        }else{
            System.out.print(number + ":  number is odd");
        }
    }
}
