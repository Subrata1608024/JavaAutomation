package Assignment5;

public class Vehicle {
    private int gear;

    public int speed;

    public void setSpeed(int speed1){
        speed =speed1;
        System.out.println(speed);
    }
    public void speedUp(int increment){
        speed += increment;
        System.out.println(speed);
    }
    public void applyBrake(int decrement){
        speed -= decrement;
        System.out.println(speed);

    }


}