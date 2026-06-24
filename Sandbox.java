public class Sandbox {
     public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("h");
            System.out.println("if an exception is thrown you won't see this message!");
        }
        catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("This can not be turned into an integer");
        }
        finally {
            System.out.println("This is the finally block");
        }
        System.out.println("End here");

    }
}
