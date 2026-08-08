import java.util.Scanner;
public class Array_Basic {
    static void main(String[] args) {
        int[] prr = {10, 20, 30, 40, 50};
        System.out.println(prr[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of an Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // array declaration
        int[] arrr = new int[n];
    }
}