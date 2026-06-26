import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args)throws ArithmeticException {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int firstNumber = scanner.nextInt();
          System.out.println("Enter a second number: ");
          int secondNumber = scanner.nextInt();

          
          try {
               if (secondNumber == 0) {
                    throw new ArithmeticException("You can not divide by zero!");
               }

               int finalResult = firstNumber/secondNumber;
               System.out.println("The result of your computation is " + finalResult);
          }

          catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
          }
          finally {
               System.out.println("Finished computing!");
               scanner.close();
          }
     }
}
