package JAVA_DSA.Basics_Flow;

public class Palindrome_string {
    public static void main(String[] args){
        String str = "OO";
        String reversestr = "";
        for(int i = str.length()-1;i>=0;i--){
             reversestr = reversestr + str.charAt(i);
        }
        System.out.println(reversestr.toLowerCase());
        System.out.println( str.toLowerCase());

        if((reversestr.toLowerCase().equals(str.toLowerCase()))){
             System.out.print("String is Palindrome");
        }else{
            System.out.print("String is not palindrome");
        }
    }
}
