public class Main {

    public static void arrayPractice(int i) {
        int array[] = new int[5];

        if (i > 5) {
            throw new ArrayIndexOutOfBoundsException(
                "Hey, don't put indexes too high!");
        }
    } 

    public static void main(String[] args){
        arrayPractice(7);
    }
}