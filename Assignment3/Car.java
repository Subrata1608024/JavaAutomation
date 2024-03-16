package Assignment3;

public class Car {

    public static String name = "Toyota";
    protected static String color = "Black";

    int number_of_wheel = 4;
    private boolean damage = true;

    public static void main(String[] args) {
        Car myobj = new Car();
        System.out.println("name: "+myobj.name);
        System.out.println("color: "+myobj.color);
        System.out.println("Number_of_wheel: "+myobj.number_of_wheel);
        System.out.println("damage: "+myobj.damage);
    }

}
