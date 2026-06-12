public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23, 34);
        Cuboid c1 = new Cuboid(r1, 54);

        System.out.println(r1.calcCircumference());
        System.out.println(r1.calcArea());
        System.out.println(c1.calcSumEdges());
        System.out.println(c1.calcVolume());
    }
}