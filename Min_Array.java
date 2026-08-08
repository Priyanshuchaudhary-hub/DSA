import java.util.Scanner;
public class Min_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the Marks of Student: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int min = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
            System.out.println("Min. Marks get the student: " + min);
    }
}