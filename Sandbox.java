import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Give an index");
          int userInput = scanner.nextInt();

          int [] array = {1, 2, 3, 4, 5};

          try {
               int number = getElement(array, userInput);
               System.err.println("index is: " + number);
          }
          catch(IndexOutOfBoundsException e) {
               System.out.println("Invalid index!");
          }
          scanner.close();
     }

     public static int getElement(int [] array, int index) {
          if (index < 0 || index >= array.length) {
               throw new IndexOutOfBoundsException();
          }
          return array[index];
     }
}
             