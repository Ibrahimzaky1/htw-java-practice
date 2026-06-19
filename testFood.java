public class testFood {
    public static void main(String[] args) {
        food [] refregerator = new food[3];

        food f1 = new food("Burger");
        food f2 = new food("Hamburger");
        food f3 = new food("Hotdog");

        refregerator[0] = f1;
        refregerator[1] = f2;
        refregerator[2] = f3;

        for(food item: refregerator) {
            System.out.println(item.name);
        }


    }
}