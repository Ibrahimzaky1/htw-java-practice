public class Cinema {
    private int auditoriumNumber;
    private int numberOfSeatsAuditorium;

    public static int numberOfSeatsCinema;
    public static int numberOfAuditoriums;

    public Cinema(int numberOfSeatsAuditorium) {numberOfAuditoriums++;
        this.auditoriumNumber = numberOfAuditoriums;
        this.numberOfSeatsAuditorium = numberOfSeatsAuditorium;
        numberOfSeatsCinema = numberOfSeatsCinema + numberOfSeatsAuditorium;
    }

    public int getAuditoriumNumber() {return auditoriumNumber;}
    public int getSeats() {return numberOfSestsAuditorium;}
    public void setSeats(int seats) {numberOfSeatsAuditorium = seats;}

    public static int getNumberOfSeatsCinema() {return numberOfSeatsCinema;}
    public int getNumberOfAuditoriums() {return numberOfAuditoriums;}



    public void print() {System.out.println(
        "Auditorium number: " + auditoriumNumber + 
        " has " + numberOfSeatsAuditorium + " seats.");}



}