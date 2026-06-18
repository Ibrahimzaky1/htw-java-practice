import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

        //fruit[0] = "Pineapple";

        //int numOfFruit =fruit.length;

        //Arrays.sort(fruits);
        Arrays.fill(fruits, "Pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


