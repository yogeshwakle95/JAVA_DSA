package JAVA_DSA.Basics_Flow;
// Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second num: ");
        int num2 = sc.nextInt();
        sc.close();
        if(num1 > num2){
            System.out.print("largest number is: "+num1);
        }else{
            System.out.print("larget number is: "+num2);
        }
    }
}
