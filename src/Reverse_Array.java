import java.util.Scanner;
public class Reverse_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}