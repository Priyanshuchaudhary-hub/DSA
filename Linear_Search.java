import java.util.Scanner;
public class Linear_Search {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        int i = 0;
        System.out.println("Enter the Element:");
        for(i = 0; i<x.length; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the Searching Value: ");
        int target = sc.nextInt();
        boolean flag = false;
        int index = -1;
        for(i = 0; i<x.length; i++) {
            if(x[i] == target){
                flag = true;
                index = i;
                // for multiple index's.
                System.out.println("The Given Number is Not Found: "+i);
               // break;
            }
        }
        if(flag == false)
            System.out.println("The Given Number is Not Found:");
      //  else
       //     System.out.println("The Number is Present at the Index of: " + i);

    }
}
