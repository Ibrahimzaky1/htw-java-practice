public class CinemaTest{

        public static void main(String[] args) {
                Cinema c1 = new Cinema(30);
                Cinema c2 = new Cinema(40);
                Cinema c3 = new Cinema(50);

                c1.print();
                c2.print();
                c3.print();

                System.out.println("The total number of seats is " + 
                        Cinema.getNumberOfSeatsCinema()
                );

                System.out.println("The total number of auditoriums is "
                + c1.getNumberOfAuditoriums());

               
        }

            

            

            

    
}