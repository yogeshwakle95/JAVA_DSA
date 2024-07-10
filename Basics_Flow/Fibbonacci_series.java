package JAVA_DSA.Basics_Flow;

public class Fibbonacci_series {
    public static void main(String[] args){
        int n = 10,num1=0,num2=1,nextNum;
        System.out.print(num1 + " "+num2);
        for(int i = 0;i<=10;i++){
             nextNum = num1+num2;
             System.out.print(" "+nextNum);
             num1 = num2;
             num2 = nextNum;
        }
    }
}
