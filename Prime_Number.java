import java.util.Scanner;
public class Prime_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
            boolean prime = true;
            if(n<=1){
                prime = false;
            }
            else{
                for(int i = 2; i<=n/2; i++){
                    if(n%i == 0){
                        prime = false;
                        break;
                    }
                }
            }
            if(prime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
    }

