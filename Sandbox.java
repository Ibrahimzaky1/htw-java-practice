import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter amount to withdraw: ");
         int withdrawAmount = scanner.nextInt();
         int accountBlanace = 100;

         try {
          if (withdrawAmount < 0) {
               throw new IllegalArgumentException(
                    "withdawal amount can not be negative!");
          }
          if (withdrawAmount > accountBlanace) {
               throw new IllegalArgumentException(
                    "Your withdraw amount is bigger than your account balance!");
          }
          accountBlanace = accountBlanace - withdrawAmount;
          System.out.println(accountBlanace);
          System.out.println("Your current balance is" + accountBlanace);
         }
         catch(IllegalArgumentException iae) {
          System.out.println(iae.getMessage());
         }

         finally {
          System.out.println("Transaction attempt finished!");
          scanner.close();
         }


     }
}
