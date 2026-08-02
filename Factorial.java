import java.sql.SQLOutput;
import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();
        int temp = 1;
        long fact = 1;
        while(temp<=n){
            fact = fact*temp;
            temp++;
         //   temp/=10;
        }
        System.out.println(fact);
    }
}
