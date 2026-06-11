public class Sandbox {
    public static void main(String[] args) {

        int n = 5;
        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            sum = sum + factorial;
        }
        System.out.println(sum);
    }
}


