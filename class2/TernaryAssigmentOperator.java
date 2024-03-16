package class2;

public class TernaryAssigmentOperator {
    public static void main(String[] args) {
        {//ternary
            int number1=30,number2=70,number3;
            number3=(number1 > number2) ? number1:100;
            System.out.println(number3);
            number3=(number1 < number2) ? number1:100;
            System.out.println(number3);

        }
        {// Assignment operator
            int number1=30,number2=70,number3;
            number1 +=number2;
            System.out.println(number1);
            number1 -=number2;
            System.out.println(number1);
            number2*=number1;
            System.out.println(number2);
        }

    }
}
