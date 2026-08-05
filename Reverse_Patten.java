import java.util.Scanner;
public class Reverse_Patten {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
