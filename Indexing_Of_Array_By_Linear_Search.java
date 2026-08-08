import java.util.Scanner;
public class Indexing_Of_Array_By_Linear_Search {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Values of an Array: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the value: ");
        int val = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (num[i] == val) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The Number is Found at the index: " + index);
        } else {
            System.out.println("The Number is Not Found.");
        }
    }
}
