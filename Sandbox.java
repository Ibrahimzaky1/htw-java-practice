public class Sandbox {
     public static void main(String[] args) {
          Carr car = new Carr();
          //vehiclee vehiclee = new vehiclee();
          car.go();
     }
}





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






/* combining arrays
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
               }   */




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








/* public static void print2DArray (int [] [] array) {
     for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array[i].length; j++) {
               System.out.print(array[i][j] + " "); 
          }
          System.out.println();
     }
}
public static void main (String [] args) {
     int [][] array = {
          {3, 4, -6},
          {10, 7, 1, -15},
          {13, 0},
     };
     print2DArray(array);
} */



/*      public static int berechneGgT(int x, int y) {
          if (x <= 0 || y <= 0) {throw new IllegalArgumentException("Integers can not be 0 or lower!");}
          while (x != y) {
               if (x > y) {
                    x = x - y;
               }
               else {
                    y = y - x;
               }
          }
          return x;
     }

     public static int [] gibGgTAus(int [] [] TDArray) {
          int [] array = new int [TDArray.length];

          for (int i = 0; i < array.length; i++) {
               try {
                    array[i] = berechneGgT(TDArray[i][0], TDArray[i][1]);
               }
               catch (Exception e) {
                    System.out.println(e.getMessage());
                    array[i] = 0;
               }
          }
          return array;
     } 

     public static void main(String[] args) {
          int [][] array = {{24, 15}, {12, -9}, {27, 81}, {10, 10}};

          int [] newArray = gibGgTAus(array);

          for (int i = 0; i < newArray.length; i++) {
               System.out.print(newArray[i] + " ");
          }
     } */




/*      public static double mittelwert(int [] array) {
          if (array == null) {throw new NullPointerException("array is null!");}

          if (array.length == 0) {throw new IllegalArgumentException("array is zero!");}

          double add = 0;

          for (int i = 0; i < array.length; i++) {
               add = add + array[i];
          }
          return add / array.length;
     }

     public static boolean vergleiche(int [] array1, int [] array2) {
          try {
               if (mittelwert(array1) == mittelwert(array2)) {
               return true;
          }
          return false;
          }
          catch (NullPointerException e) {
               System.out.println(e.getMessage());
               return false;
          }
          catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
               return false;
          }
     }

     public static void main(String[] args) {
          int [] array1 = {};
          int [] array2 = {2, 3, 4, 5};

          System.out.println(vergleiche(array1, array2));
     } */
