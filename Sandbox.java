import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String userPassword = "OpenAI123";
          
          int attempts = 3;


          while (attempts > 0) {
               System.out.println("Enter your password: ");
               String userInput = scanner.next();
               try {
                    if (userInput.equals(userPassword)) {
                         System.out.println("Access granted");
                         break;
                    }
                     
                    else {
                         attempts--;
                         throw new IllegalArgumentException("Login failed");
                    }
                    
                    
               }
               catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Attempts left: " + attempts);
               }
          }

          if (attempts == 0) {
               System.out.println("Too many failled attempts. Access blocked.");
          }
          

     }
}
