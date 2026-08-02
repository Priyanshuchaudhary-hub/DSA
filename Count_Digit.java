import java.util.Scanner;
public class Count_Digit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit:");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            count++;
            temp/=10;
        }
        System.out.println(count);
    }
}
