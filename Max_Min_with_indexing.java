import java.util.Scanner;
public class Max_Min_with_indexing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the Marks of Student: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int max = marks[0];
        int index = 0;
        for(int i = 1; i<n; i++) {
            if(marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }
        System.out.println("Max. Marks of the Student obtained: "+max);
        System.out.println("Max.Student Marks obtained at the index of: "+index);

        int min = marks[0];
        index = 0;
        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
                index = i;
            }
        }
        System.out.println("Min. Marks of the student obtained: " + min);
        System.out.println("Min. Student Marks obtained at the index of: " + index);

    }
}

