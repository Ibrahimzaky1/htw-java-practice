
public class Sandbox {

     public static int[] initilize(int len) {
          int[] temp = new int[len];

          for (int i = 0; i < temp.length; i++) {
               temp[i] = i;
          }
          return temp;
     }

     public static void main(String[] args) {
       int[] array = initilize(5);

       for (int i = 0;  i < array.length; i++) {
          System.out.println(array[i]);
       }
       
     }
}
