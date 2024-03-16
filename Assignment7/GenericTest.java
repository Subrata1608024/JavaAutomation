package Assignment7;

import Class8.GenericNumber;

public class GenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(556);
        System.out.println(integerTest.getInteger());

        StringTest stringTest = new StringTest("Shawon");
        System.out.println(stringTest.getString());

        DoubleTest doubleTest = new DoubleTest(987.14);
        System.out.println(doubleTest.getaDouble());

        LongTest longTest = new LongTest(34567l);
        System.out.println(longTest.getaLong());

        System.out.println("===============================================================");


        Generic<Integer> integerGeneric=new Generic<>(258);
        System.out.println(integerGeneric.getObj());

        Generic<String> stringGeneric= new Generic<>("Shawon");
        System.out.println(stringGeneric.getObj());

        Generic<Double> doubleGeneric= new Generic<>(3456.35);
        System.out.println(doubleGeneric.getObj());

        Generic<Long> longGeneric = new Generic<>(897l);
        System.out.println(longGeneric.getObj());

        System.out.println("===============================================================");

        GenericNumber<Long> genericNumber=new GenericNumber<>(6541l);
        System.out.println(genericNumber.getObj());


    }
}
