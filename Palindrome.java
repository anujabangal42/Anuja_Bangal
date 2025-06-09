public class Palindrome {
    public static void main(String[] args) {
        int no=123;
        int temp=no;
        int rev=0;
        while(no>0){
       int rem=no%10;
        rev=rev*temp+rem;
        no=no/10;
        }
        if(temp==rev){
            System.out.println("The given number is palindrome");
        }else
    {
        System.out.println("The number is not palindrome");
    }

        }
    }

