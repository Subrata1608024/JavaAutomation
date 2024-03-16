package Assignment5;

public class AssignmentHierarchicalInheritance {
    public static void main(String[] args) {
        Lambargini lambargini =new Lambargini();
        lambargini.setSpeed(90);
        lambargini.speedUp(30);
        lambargini.applyBrake(20);

        Toyota toyota = new Toyota();
        toyota.setSpeed(55);
        toyota.speedUp(10);
        toyota.applyBrake(5);
    }
}


