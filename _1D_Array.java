import java.util.Scanner;
public class _1D_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the Marks of Students: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int Largest_Marks = marks[0];
        int Smallest_Marks = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > Largest_Marks)
                Largest_Marks = marks[i];
        }
        System.out.println("The Largest Marks is: " + Largest_Marks);
        for (int i = 1; i < n; i++) {
            if (marks[i] < Smallest_Marks)
                Smallest_Marks = marks[i];
        }
        System.out.println("The Smallest Marks is: " + Smallest_Marks);
        long sum = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + marks[i];
            // average = (double)sum/n;  also use this to convert sum ko long se double m change karna.
            average = 1.0 * sum / n;
        }
        System.out.println("Sum: " + sum);
        System.out.println("The Average Marks is: " + average);

        System.out.println("Enter The value: ");
        int val = sc.nextInt();
        boolean bo = false;
        for (int i = 0; i < n; i++) {
            if (marks[i] == val) {
                bo = true;
                break;
            }
        }
        if (bo == false) {
            System.out.println("The Number is Not Found.");
        } else {
            System.out.println("The Number is Found.");
        }
    }
}
