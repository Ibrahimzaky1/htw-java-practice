import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          int [] array = {5, 10, 15, 20, 25};
          int [] array2 = null;

          try {
               swap(array, 1, 2);
               printArray(array);
          }
          catch (NullPointerException e) {
               System.out.println("Array can not be null!");
          }
          catch (IndexOutOfBoundsException e) {
               System.out.println("Invalid index!");
          }
          try {
               swap(array2, 1, 2);
               printArray(array2);
          }
          catch (NullPointerException e) {
               System.out.println("Array can not be null!");
          } 
          catch (IndexOutOfBoundsException e) {
               System.out.println("Invalid index!");
          }
          try {
               swap(array, 6, 7);
               printArray(array);
          }
          
          catch (NullPointerException e) {
               System.out.println("Array can not be null!");
          } 
          catch (IndexOutOfBoundsException e) {
               System.out.println("Invalid index!");
          }
          

     }

     public static void swap(int [] array, int index1, int index2) throws NullPointerException {
          if (array == null) {throw new NullPointerException();};
          if (index1 < 0 || index1 >= array.length 
               || index2 < 0 || index2 >= array.length) {
                    throw new IndexOutOfBoundsException();
               }
               int temp = array[index1];
               array[index1] = array[index2];
               array[index2] = temp;
     }
     public static void printArray(int [] array) {
          for (int i:array) {
               System.out.print(i + " ");
          }
          System.out.println();
     }
}
 