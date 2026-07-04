import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          int [] originalArray = {1, 2, 3, 4, 5};

          int [] smallerArray = remove(originalArray, 0);

          for (int i : smallerArray) {
               System.out.print(i + " ");
          }
     }
     public static int [] remove(int [] array, int index) {
          int [] newArray = new int[array.length - 1];

          for (int i = 0; i < index; i++) {
               newArray[i] = array[i];
          }

          for (int i = index + 1; i < array.length; i++) {
               newArray[i - 1] = array[i];
          }
          return newArray;
     }
}
