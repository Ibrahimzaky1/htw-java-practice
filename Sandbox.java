import java.util.InputMismatchException;
import java.util.Scanner;

public class Sandbox {
     public static void main(String[] args) {
        try {
            //getInt();
            System.out.println(getInt());
        }
        catch(NumberFormatException nfe) {
            System.out.println("You can't turn a String into an Integer");
        }
        finally {
            System.out.println("This is the final code!");
        }
     }

     public static int getInt() {
        int myInt = Integer.parseInt("1");
        return myInt;
     }
}
