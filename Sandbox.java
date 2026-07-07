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
/*           int [] array = {10, 20, 30, 40, 50};
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
          System.out.println(); */







/*     
               combining arrays
               int [] array = {1, 2, 3, 4};
               int [] array1 = {5, 6, 7, 8};

               int [] combindedArray = new int[array1.length + array.length];
              

               for (int i = 0; i < array.length; i++) {
                    combindedArray[i] = array[i];
               }

               for (int i = 0; i < array1.length; i++) {
                    combindedArray[array.length + i] = array1[i];
               }


               for (int i = 0; i < combindedArray.length; i++) {
                    System.out.print(combindedArray[i]);
               }  */





/*           
          making a smaller and a bigger array from original array
          public static void main(String[] args) {
               int [] originalArray = {1, 2, 3, 4, 5, 6, 7};

               int [] biggerCopy = copy(originalArray, 11);
               int [] smallerCopy = copy(originalArray, 5);

               printArray(smallerCopy);
               printArray(biggerCopy);
          }

          public static int[] copy(int[] originalArray, int newLength) {
               int [] copy = new int[newLength];

               if (originalArray.length <= newLength){
                    for (int i = 0; i < originalArray.length; i++) {
                         copy[i] = originalArray[i];
                    }
               }
               else {
                    for (int i = 0; i < newLength; i++) {
                         copy[i] = originalArray[i];
                    }
               }
               return copy;
          }

          public static void printArray(int [] array) {
               for (int i : array) {
                    System.out.println(i);
               }
          } */






/*           
          adding an element anywhere in array
          int [] originalArray = {1, 2, 3, 4, 5};

          int [] biggerArray = insert(originalArray, 5,6);

          System.out.println("Original array is: ");
          printArray(originalArray);

          System.out.println("Bigger array is: ");
          printArray(biggerArray);
     }

     public static int [] insert(int [] array, int index, int newNumber) throws NullPointerException {
          if (array == null) throw new NullPointerException("Array null!");

          int [] newArray = new int[array.length + 1];

          for (int i = 0; i < index; i++) {
               newArray[i] = array[i];
          }
          newArray[index] = newNumber;
          for (int i = index; i < array.length; i++) {
               newArray[i + 1] = array[i];
          }
          return newArray;
     }

     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println(); */




     /*        
               insertionSort
               int [] array = {3, 5, 2, 6, 7, 1};
     
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





/*        
          making a smaller and a bigger array from original array and adding a 7 to the end
          int [] originalArray = {1, 2, 3, 4, 5, 6};

          int [] biggerCopy = copy(originalArray, 7);
          int [] smallerCopy = copy(originalArray, 4);

          System.out.println("Original array is: ");
          printArray(originalArray);

          System.out.println("Bigger array is: ");
          printArray(biggerCopy);

          System.out.println("Smaller array is: ");
          printArray(smallerCopy);
     }

     public static int [] copy(int[] originalArray, int newLength) {
          int [] copy = new int[newLength];
          
          if (originalArray.length <= newLength) {
               for (int i = 0; i < originalArray.length; i++) {
                    copy[i] = originalArray[i];

                    copy[copy.length - 1] = 7;
               }
          }
          else {
               for (int i = 0; i < newLength; i++) {
                    copy[i] = originalArray[i];
               }
          }
          return copy;
     }
     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.err.println(); */


















/*        Bubblesort iterative
          int [] array = {4, 2, 77, 44, 3, 90};

          bubbleSort(array);

          for (int i : array) {
               System.out.println(i);
          }
     }

     public static void bubbleSort(int[] array) {
          for (int i = 0; i < array.length - 1; i++) {
               for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                         int temp = array[j];
                         array[j] = array[j+1];
                         array[j + 1] = temp;
                    }
               }
          } */














/*             
          making a mthod that creates arrays
               int [] array1 = initilize(5);
               int [] array2 = initilize(7);

               System.out.println("Array 1: ");
               printArray(array1);

               System.out.println("Array 2: ");
               printArray(array2);

          }

          public static  int [] initilize (int length) {
               int [] temp = new int[length];

               for (int i = 0; i < temp.length; i++) {
                    temp[i] = i;
               }
               return temp;
          }
          public static void printArray(int[] array) {
               for (int i = 0; i < array.length; i++) {
                    System.out.printl(i + " ");
               }
               System.out.println(); */














/*        int [] originalArray = {1, 2, 3, 4, 5};

          
          int [] biggerArray = insert(originalArray, 6);

          System.out.println("Original array is: ");
          printArray(originalArray);

          System.out.println("After inserting 6: ");
          printArray(biggerArray);
     }

     public static int [] insert(int [] array, int newNumber) throws NullPointerException {
          if (array == null) throw new NullPointerException("Array Null!");

          int [] newArray = new int[array.length + 1];

          for (int i = 0; i < array.length; i++) {
               newArray[i] = array[i];
          }

          newArray[newArray.length - 1] = newNumber;

          return newArray;
     }

     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println(); */


















/*        int [] originalArray = {1, 2, 3, 4, 5};

          
          int [] biggerArray = insert(originalArray, 6);

          System.out.println("Original array is: ");
          printArray(originalArray);

          System.out.println("After inserting 6: ");
          printArray(biggerArray);
     }

     public static int [] insert(int [] array, int newNumber) throws NullPointerException {
          if (array == null) throw new NullPointerException("Array Null!");

          int [] newArray = new int[array.length + 1];

          for (int i = 0; i < array.length; i++) {
               newArray[i] = array[i];
          }

          newArray[newArray.length - 1] = newNumber;

          return newArray;
     }

     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println(); */














/*      
     binary search
     private static int binarySearch(int[] numbers, int numberToFind) {
     
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






/*        
          removing an element from an array
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
          return newArray; */






/*        
          finding maximum number
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
          return max; */






























/*          
          adding an element to the end of array
          int [] originalArray = {1, 2, 3, 4, 5};

          int [] biggerArray = insert(originalArray, 6);

          System.out.println("Original array is: ");
          printArray(originalArray);

          System.out.println("Array with new element 6 is: ");
          printArray(biggerArray);
          
     }
     public static int [] insert (int [] array,int newNumber) throws NullPointerException {
          if (array== null) throw new NullPointerException("Array null!");

          int [] newArray = new int[array.length + 1];

          for (int i = 0; i < array.length; i++) {
               newArray[i] = array[i]; 
          }
          newArray [newArray.length - 1] = newNumber;

          return newArray;
     }

     public static void printArray(int [] array) {
          for (int i : array) {
               System.out.print(i + " ");
          }
          System.out.println(); */