import java.util.Scanner;
public class Power_Of_A_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number:");
        int base = sc.nextInt();
        System.out.println("Enter the Power Number:");
        int power = sc.nextInt();
        int result = 1;
        for(int i=1;i<=power;i++){
             result = result*base;

        }
        System.out.println(result);
    }
}
