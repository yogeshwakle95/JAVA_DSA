package JAVA_DSA.Basics_Flow;
// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting_msg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String fname = sc.next();
        System.out.print("Enter last name: ");
        String lname = sc.next();
        System.out.print("\nHello, \n \t"+ fname +" "+ lname);
    }
}