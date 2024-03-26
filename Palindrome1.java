public class Palindrome1 {
    public static void main(String[] args) {
        int r,sum=0,temp;

        int n=23432;
        temp =n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            
        }
        if(temp==sum){
            System.out.println(temp+ " is Palindrome!");
        }
        else{
            System.out.println(temp+ " is not Palindrome");
        }

    }
    
}
