public class Test {
    public static void main(String[] args) {
        char [] characters = {'a', 'b', 'c', 'b', 'd'};
        ArrayWrapper wrapper = new ArrayWrapper(characters);
        int index = wrapper.findFirstCharOccurenceIndex('b');
        System.out.println("First occurence of b is at index: " + index);
        boolean removed = wrapper.tryRemoveFirstCharOccurence('b');
        System.out.println("After removing first b: " + removed);
        printArray(wrapper.getInternalArray());
        try {
            wrapper.insertChart('x', 2);
            System.out.println("After inserting x at index 2: ");
            printArray(wrapper.getInternalArray());
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void printArray(char[] array) {

        for (char character : array) {
            System.out.print(character + " ");
        }

        System.out.println();
    }
}