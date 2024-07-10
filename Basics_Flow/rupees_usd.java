package JAVA_DSA.Basics_Flow;

// Input currency in rupees and output in USD.

import java.util.Scanner;
public class rupees_usd {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the rupees: ");
       float rupees =sc.nextInt();
       float usd = rupees/85;
       System.out.print("Doller : "+ usd);
    }
}
