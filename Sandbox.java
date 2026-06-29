import java.util.Arrays;

public class Sandbox {
          public static void main(String[] args) {
               int [] original = {1, 2, 3, 4, 5};

               int [] biggerCopy = copy(original, 7);
               int [] smallerCopy = copy(original, 3);

               System.out.println("Bigger array copy: ");
               for (int i : biggerCopy) {
                    System.out.println(i + "");
               }

               System.out.println("Smaller array copy: ");
               for (int i : smallerCopy) {
                    System.out.println(i);
               }
          }

          public static int[] copy(int [] original, int newLength) {
               int [] copy = new int[newLength];

               if (original.length <= newLength) {
                    for (int i = 0; i < original.length; i++) {
                         copy[i] = original[i];
                    }
               }
               else {
                    for (int i = 0; i < newLength; i++) {
                         copy[i] = original[i];
                    }
               }
               return copy;
          }
}

     /*           int [] array = {3, 5, 2, 6, 7, 1};
     
               insertionSort(array);
     
               for (int i: array) {
                    System.out.println(i);
               }
          }  
          public static void insertionSort(int[] array) {
               for (int i = 1; i < array.length; i++) {
                    int temp = array[i];
                    int j = i - 1;
                    while (j >= 0 && array[j] > temp) {
                         array[j+1] = array[j];
                         j--;
               }
               array[j+1] = temp;
               } */


/*      private static int binarySearch(int[] numbers, int numberToFind) {
     
          int low = 0;
          int high = numbers.length - 1;

          while (low <= high) {
               int middlePosition  = (low + high) / 2;
               int middleNumber = numbers[middlePosition];

               if (numberToFind == middleNumber) {
                    return middlePosition;
               }
               if (numberToFind < middleNumber) {
                    high = middlePosition - 1;
               }
               else {
                    low = middlePosition + 1;
               }
          }
          return -1;
     } */

      

