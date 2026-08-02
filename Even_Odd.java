import java.sql.SQLOutput;
import java.util.Scanner;
public class Even_Odd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
     //   System.out.println("n:");
        if(n%2 == 0){
            System.out.println("It is an Even Number.");
        }
        else{
            System.out.println("It is not an Odd Number.");
        }
    }
}
