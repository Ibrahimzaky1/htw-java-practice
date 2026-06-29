
public class Sandbox {
     public static void main(String[] args) {

          int [] ints = {1, 2, 4, 5, 7, 9, 11};

         System.out.println(binarySearch(ints, 9));

     }

     private static int binarySearch(int[] numbers, int numberToFind) {
          int low = 0;
          int high = numbers.length - 1;

          while (low <= high) {
               int middlePosition = (low + high) / 2;
               int middleNumber = numbers[middlePosition];
               if (numberToFind == middleNumber) {
                    return middlePosition;
               }
               if (numberToFind < middleNumber) {
                    high = middlePosition - 1;
               } else {
                    low = middlePosition + 1;
               }
          }
          return -1;
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


}
