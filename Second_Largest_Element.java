import java.util.*;
public class Second_Largest_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        System.out.println("Enter the Element:");
        for(i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
          for( i =0; i<arr.length; i++){
              if(arr[i]>max)
                  max = arr[i];
          }
          int Smax = Integer.MIN_VALUE;
          for( i = 0; i<arr.length; i++){
              if(arr[i]>Smax && arr[i]!=max)
                  Smax = arr[i];
          }
      //    System.out.println("Maximum Element: "+max);
          System.out.println("Second Maximum Element: "+Smax);
        }
    }