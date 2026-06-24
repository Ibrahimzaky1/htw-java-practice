public class Sandbox {
     public static double mittelwert(int[] arr) throws NullPointerException {
        if (arr == null) {
            throw new NullPointerException("Array ist null!");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    // Compares the averages of two arrays
    public static boolean vergleich(int[] a, int[] b) {
        if (mittelwert(a) == mittelwert(b)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        int[] y = null;

        boolean result = vergleich(x, y);

        System.out.println(result);
    }
}
