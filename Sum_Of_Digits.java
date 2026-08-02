import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int que = temp%10;
            rev = rev+que;
            temp/=10;
        }
        System.out.println(rev);
    }
}

