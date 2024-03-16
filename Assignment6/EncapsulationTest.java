package Assignment6;



public class EncapsulationTest {

    public static void main(String[] args) {

        EncapsulationWriteOnly encapsulationWriteOnly = new EncapsulationWriteOnly();
        encapsulationWriteOnly.setName("Subrata");
        System.out.println(encapsulationWriteOnly.getName());
        EncapsulationReadOnly encapsulationReadOnly =new EncapsulationReadOnly();
        System.out.println(encapsulationReadOnly.getName());

    }


    }


