public class Dog extends Animal{
    public void eat(){
        System.out.println("munch munch");
    }

    public void eat(int numberOfMunch){
        for (int i = 0; i < numberOfMunch; i++) {
            System.out.println("munch munch");
        }
    }
}