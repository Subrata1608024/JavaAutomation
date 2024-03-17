package Class7;

public interface Animal {

     int height = 3;
    void eat();

    void sleep();

    void move();

    public default void hunt(){

        System.out.println("Hunting");
    }
}
