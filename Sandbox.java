import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          int [] array = {1, 2, 3, 4, 5, 6};

          int max = findMaximum(array);

          System.out.println("Maximum: " + max);
     }

     public static int findMaximum(int [] array) {
          int max = array[0];

          for (int i = 0; i < array.length; i++) {
               if (array[i] > max) {
                    max = array[i];
               }
          }
          return max;
     }
}
