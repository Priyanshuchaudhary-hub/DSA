import java.util.Scanner;
public class Sum_Of_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter The Numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
            System.out.println("The Sum of Nummber is: " + sum);
        }
    }
