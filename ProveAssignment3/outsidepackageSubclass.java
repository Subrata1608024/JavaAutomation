package ProveAssignment3;

import Assignment3.Car;

public  class outsidepackageSubclass extends Car {
    public static void main(String[] args) {
        outsidepackageSubclass car = new outsidepackageSubclass();

        System.out.println(outsidepackageSubclass.name);
        System.out.println(outsidepackageSubclass.color);

    }
}
