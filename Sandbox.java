import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          int [] array = {10, 20, 30, 40, 50};
          int [] array1 = null;

          try {
               reversePair(array, 1);
               printArray(array);
          }
          catch (NullPointerException e) {
               System.out.println("Array can not be null!");
          }
          catch (IndexOutOfBoundsException e) {
               System.out.println("Invalid index");
          }
          try {
               reversePair(array1, 1);
               printArray(array1);
          }
          catch (NullPointerException e) {
               System.out.println("Array can not be null!");
          }
          catch (IndexOutOfBoundsException e) {
               System.out.println("Invalid index");
          }
          try {
               reversePair(array, 4);
               printArray(array);
          }
          catch(IndexOutOfBoundsException e) {
               System.out.println();
          }
     }
     public static void reversePair(int [] array, int index) {
          if (array == null) {throw new NullPointerException();}
          if (index < 0 || index > array.length - 1) {throw new IndexOutOfBoundsException();}
          int temp = array[index];
          array[index] = array[index + 1];
          array[index + 1] = temp;
     }

     public static void printArray(int [] array) {
          for (int i:array) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}
