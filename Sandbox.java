
public class Sandbox {
     public static void main(String[] args) {
          int[] array = {22, 33, 44};
          int[] arrayCopy = new int[array.length + 1];

          
          for (int i = 0; i < array.length; i++) {
               arrayCopy[i] = array[i];
          }

          arrayCopy[arrayCopy.length-1] = 55;

          for (int i = 0; i < arrayCopy.length; i++) {
               System.out.println(arrayCopy[i]);
          }


          for (int i = 0; i < array.length; i++) {
               System.out.println(array[i]);
          }
     }
}
