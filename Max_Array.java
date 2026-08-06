import java.util.Scanner;
public class Max_Array {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Maximum Number is: "+ max);
    }
}
