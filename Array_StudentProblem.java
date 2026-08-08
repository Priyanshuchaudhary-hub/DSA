import java.util.Scanner;
public class Array_StudentProblem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Student: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the Marks of Students: ");
        for(int i = 0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        // indexing
        int index = -1;
        System.out.println("Roll no. of these Student which is fail: ");
        for(int i = 0; i<marks.length; i++){
            if (marks[i]<35) {
                System.out.println(i);
            }
            }
        }
    }

