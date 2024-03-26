import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String or Number to Check if it is Palindrome or not: ");
        str=sc.nextLine();
        int n=str.length();

        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);            
        }
        
        if(str.equals(rev)){
            System.out.println(str + " is Palindrome!");
        }
        else{
            System.out.println(str+ " is not Palindrome");
        }
        sc.close();
    }
}
