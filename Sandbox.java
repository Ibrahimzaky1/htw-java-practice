import java.io.IOException;

public class Sandbox {
     public static void main(String[] args) throws IOException {
          arrayPractice(3);
     }

     public static void arrayPractice(int i) {
          int a[] = new int[5];

          if (i < 0 ||i >= 5) {
               throw new ArrayIndexOutOfBoundsException("Hey, don't put indexes too high");
          }
     }
}
