import java.util.Scanner;
public class Prefix_Sum {
    static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // prefix sum
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        System.out.println("The Prefix Sum of Element is: ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
