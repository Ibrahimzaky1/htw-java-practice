public class Sandbox {


    public static int factorialSum(int input) {
        if (input <= 1) return 1; return factorial(input) + factorialSum(input - 1);
    }

    public static int factorial(int input) {
        if (input <= 1) return 1;
        return input * factorial(input - 1);
    }


    public static void main(String[] args) {
        int result = factorialSum(5);
        System.out.println(result);
        }
    
}


