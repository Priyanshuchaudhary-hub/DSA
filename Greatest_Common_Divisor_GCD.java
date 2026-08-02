import java.util.Scanner;
public class Greatest_Common_Divisor_GCD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        int gcd = 1; // also knows an HCf.
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
