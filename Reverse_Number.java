import java.util.Scanner;
public class Reverse_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
             rev =rev*10+rem;
            temp/=10;
        }
        System.out.println(rev);
    }
}
