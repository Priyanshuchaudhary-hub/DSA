import java.util.Scanner;
public class LCM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        int HCF = 1;
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                HCF = i;
            }
        }
        System.out.println((a*b)/HCF);
    }
}
