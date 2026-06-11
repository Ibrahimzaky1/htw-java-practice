public class TennisPlayer {
    private String surname;
    private int age;
    private int startingNumber;

    public TennisPlayer (String surename, int age, int startingNumber) {
        this.surname = surename;
        this.age = age;
        this.startingNumber = startingNumber;
    }

    public void print() {
        System.out.printf
        ("name: %-12s age: %-3d startingnumber: %-3d%n",
            surname,
            age,
            startingNumber
        );}
}