public class TestPunkt{

        public static void main(String[] args) {

                Punkt p1 = new Punkt(2, 3);
                Punkt p2 = new Punkt(2, 2);
                Punkt p3 = new Punkt(5, 5);

               // Punkt pReflection = p1.createReflection();

        
                //p1.setX(3);
                //p1.setY(9);

                //System.out.println(Punkt.counter);
                
                //System.out.println(p1 + "\n" + p2);

                //p1.move(3, 4);

                //System.out.println(p2 + "\n" + p3);

                p2.moveWithin(5, -6);
                System.out.println(p2);
                //System.out.println(p1.compareX(p2));

                //System.out.println(p1.compareY(p2));
        }

            

            

            

    
}