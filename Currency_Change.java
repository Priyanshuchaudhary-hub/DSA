import java.util.Scanner;
public class Currency_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int TotalNotes = 0;
        for (int note : notes) {
            if (amount >= note) {
               int count = amount / note;
                amount = amount % note;
               TotalNotes += count;
                if (note >= 10) {
                    System.out.println(count + " note of " + note);
                } else {
                    System.out.println(count + " coin of " + note);
                }
            }
             //   System.out.println("Total Notes/Coins = " + TotalNotes);

            }
        System.out.println("Total Notes/Coins = " + TotalNotes);
        }
    }

