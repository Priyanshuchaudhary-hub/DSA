import java.util.Scanner;
public class Palindrome_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
            if(n==rev){
                System.out.println("It is a Palindrome Number");
            }
            else{
                System.out.println("It is not a palindrome Number");
            }
        }
    }

