
public class Sandbox {
     public static void main(String[] args) {
          int [] array = {22, 33, 44, 55};
          int [] arrayCopy = new int[array.length];

          arrayCopy = array;
          
          for (int i = 0; i < array.length; i++) {
               array[i] = arrayCopy[i];
          }

          for (int i = 0; i < arrayCopy.length; i++) {
               System.out.println(arrayCopy[i]);
          }
     }

}
