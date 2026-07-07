import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter first index");
          int index1 = scanner.nextInt();
          System.out.println("Enter second index: ");
          int index2 = scanner.nextInt();

          int [] array = {1, 2, 3, 4, 5, 6};

          try {
               swap(array, index1, index2);
               printArray(array);
          }
          catch(IndexOutOfBoundsException e) {
               System.out.println("Invalid index!");
          }
          scanner.close();
     }

     public static void swap(int [] array, int index1, int index2) {
          if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
               throw new IndexOutOfBoundsException();
          }
          int temp = array[index1];
          array[index1] = array[index2];
          array[index2] = temp;
     }
     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}
 