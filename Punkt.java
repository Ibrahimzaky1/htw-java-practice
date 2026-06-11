public class Punkt {

    private int x;
    private int y;

    public static int counter = 0;

    public static final int INTERVALL = 10;

    public static final int lowerLimit = -10;
    public static final int upperLimit = 10;
    
    //public boolean compareX(Punkt p) {if (x == p.getX()) return true; else return false;}

    public Punkt (int x, int y){
        this.x = x; this.y = y; counter++;
        if (counter % INTERVALL == 0) 
            System.out.println(counter + "points added.");}

    public Punkt createReflection() {Punkt p = new Punkt(-x, -y); return p;}

    public int getX() {return x;}
    public int getY () {return y;}

    public void setX (int newX) {newX = x;}
    public void setY (int newY) {newY = y;}
    
    public String toString () {return x + ", " + y;}

    public void moveWithin (int deltaX, int deltaY) {
        int newX = x + deltaX; int newY = y + deltaY;
        if(newX <= upperLimit &&
        newX >= lowerLimit &&
        newY <= upperLimit &&
        newY >= lowerLimit) {
            move(deltaX, deltaY);
        }
        else {System.out.println("Invalid input");}
    }

    //public void move (int deltaX, int deltaY) {x = x + deltaX; y = y + deltaY;}

    public void moveHorizontally(int dX) {x = x + dX;}

    public void moveVertically(int dY) {y = y + dY;}

    public void move(int delX, int delY) {moveHorizontally(delX); moveVertically(delY);}

    public boolean compareX(Punkt p) {return x == p.getX();}

    public boolean compareY (Punkt p) {return y == p.getY();}

    public static int getCounter() {return counter;}




}