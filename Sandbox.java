import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
          int [] array1 = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
          int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

          try {
               System.out.println("The length difference is: ");
               System.out.println(laengenUnterschied(array1, array2));
          }
          catch (ArithmeticException e) {
          System.out.println("Length can not be negative!");
          }
          System.out.println("Array 1 is: ");
          unterZehnAusgaben(array1);
          System.out.println();
          System.out.println("Array 2 is: ");
          unterZehnAusgaben(array2);

     }
     public static int laengenUnterschied(int [] array1, int [] array2) {
          
          int lengthDifference = (array1.length - array2.length);
          if (lengthDifference < 0) {
               throw new ArithmeticException();
          }
          else {
               return lengthDifference;
          }
     }
     public static void unterZehnAusgaben(int [] array) {
          for (int i = 0; i < array.length; i++) {
               if (array[i] <= 10) {
                    System.out.print(array[i]);
               }
               System.out.print(" ");
          }
     }
}
