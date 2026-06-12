public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {return length;}
    public void setLength(float newLength) {
        length = newLength;
    }

    public float getWidth() {return width;}
    public void setlLength(float newLength) {
        length = newLength;
    }

    public float calcArea() {
        return length * width;
    }

    public float calcCircumference() {
    return 2 * length + 2 * width;
    }

}