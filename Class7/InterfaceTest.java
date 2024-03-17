package Class7;

public class InterfaceTest {
    public static void main(String[] args) {

        System.out.println("Dog object "+Dog.height);

        Dog dog = new Dog();
        dog.name ="jdk";
        dog.sound();
        dog.eat();


        System.out.println("Animal variable : "+Animal.height);

        Animal animal = new Dog();
        animal.eat();
        animal.sleep();






    }
}
