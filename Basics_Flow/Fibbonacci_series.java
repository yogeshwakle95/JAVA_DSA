package JAVA_DSA.Basics_Flow;

public class Fibbonacci_series {
    public static void main(String[] args){
        int n = 10,temp,num1 = 0,num2;
        for(int i = 0;i<=10;i++){
             temp = num1;
             num2 = temp + num1;
             num1 = num2;
        }
    }
}
