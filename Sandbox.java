import java.util.Arrays;

public class Sandbox {
          public static void main(String[] args) {
               int [] array1 = initilize(5);

               int [] array2 = initilize(9);

               System.out.println("Array 1: ");
               printArray(array1);

               System.out.println("Array 2: ");
               printArray(array2);

          }


          public static int[] initilize (int length) {
               int [] temp = new int[length];

               for (int i = 0; i < temp.length; i++) {
                    temp[i] = i;
               }
               return temp;
          }

          public static void printArray(int [] array) {
               for (int i : array) {
                    System.out.print(i + " ");
               }
               System.out.println();
          }
}



