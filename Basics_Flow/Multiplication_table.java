package JAVA_DSA.Basics_Flow;
import java.util.*;
public class Multiplication_table{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num +" * " + i +" = "+ num*i);
        }
    }
}