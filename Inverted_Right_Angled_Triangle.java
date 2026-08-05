import java.util.Scanner;
public class Inverted_Right_Angled_Triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k =n-i; k>=0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
