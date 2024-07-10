package JAVA_DSA.Basics_Flow;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Calculate_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Operator(+, -, *, /): ");
        int operator = sc.next().charAt(0);
        int result;
        if(operator == '+'){
            result = num1+num2;
            System.out.print("Result is: "+result);
        }else if(operator == '-'){
            result = num1 - num2;
            System.out.print("Result is: "+result);
        }else if(operator == '*'){
            result = num1 * num2;
            System.out.print("Result is: "+result);
        }else if(operator == '/'){
            result = num1/num2;
            System.out.print("Result is: "+result);
        }else{
            System.out.print("Invalid operator");
        }


    }
}
