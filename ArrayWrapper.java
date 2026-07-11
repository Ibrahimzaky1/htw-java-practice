public class ArrayWrapper{
    private char [] internalArray;

    public ArrayWrapper (char [] internalArray) {
        this.internalArray = internalArray;
    }

    public char [] getInternalArray () {
        return this.internalArray;
    }

    public void setInternalArray (char [] internalArray) {
        this.internalArray = internalArray;
    }

    public int findFirstCharOccurenceIndex(char charToFind) {
        for (int i = 0; i < this.internalArray.length; i++) {
            if (this.internalArray[i] == charToFind) {
                return i;
            }
        }
        return -1;
    }
    public boolean tryRemoveFirstCharOccurence (char charToRemove) {
        int index = findFirstCharOccurenceIndex(charToRemove);

        if (index == -1) {
            return false;
        }

        char [] newArray = new char[this.internalArray.length - 1];

        int j = 0;

        for (int i = 0; i < this.internalArray.length; i++) {
            if (i != index) {
                newArray[j] = this.internalArray[i];
                j++;
            }
        }
        this.internalArray = newArray;

        return true;
    }

    public void insertChart(char charToInsert, int insertionsIndex) {
        if (insertionsIndex > this.internalArray.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        char [] newArray = new char[this.internalArray.length - 1];

        for (int i = 0; i < insertionsIndex; i++) {
            newArray[i] = this.internalArray[i];
        }
        newArray[insertionsIndex] = charToInsert;

        for (int i = insertionsIndex; i < this.internalArray.length; i++) {
            newArray[i + 1] = this.internalArray[i];
        }
        this.internalArray = newArray;
    }   
}

