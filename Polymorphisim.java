public class Polymorphisim {
    public static void main (String args[]){
        Animal animal = new Animal();

        animal.eat();

        Cat cat = new Cat();

        cat.eat();

        Dog dog = new Dog();

        dog.eat();
        dog.eat(3);
    }
}