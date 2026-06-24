public class Sandbox {
     public static void main(String[] args) {
        try {
            getInt();
        }
        catch (Exception e) {
            System.out.println("You can't turn a string into an integer");
        }
        System.out.println("End here");
    }

    public static void getInt () {
        int myInt = Integer.parseInt("pants");
    }

}
