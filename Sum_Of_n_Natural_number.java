import java.util.Scanner;
public class Sum_Of_n_Natural_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
