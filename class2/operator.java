package class2;

public class operator {
    public static void main(String[] args) {
        { //UnaryOperator
            int number=5;
            System.out.println(number++);
            System.out.println(++number);
            System.out.println(number--);
            System.out.println(--number);
            System.out.println(number);
        }
        { //Arithmatic Operator
            int number1=60,number2=5,number3;
            System.out.println(number3=number1/number2);
            System.out.println(number3=number1+number2);
            System.out.println(number3=number1%number2);
            System.out.println(number3=number1-number2);

        }
        {//Relational operator
            int number1 =15,number2 = 20;
            boolean number3;
            number3=number1>number2;
            System.out.println(number3);
            number3=number1<number2;
            System.out.println(number3);
            number3=number1<=number2;
            System.out.println(number3);
            number3=number1>=number2;
            System.out.println(number3);
            number3=number1==number2;
            System.out.println(number3);
            number3=number1!=number2;
            System.out.println(number3);
        }

        {//logical operator
            int number1=30, number2=60;
            System.out.println(number1>number2&&number1<number2);
            System.out.println(number1>number2||number1<number2);
            System.out.println(number1!=number2||number1<number2);
        }
}
}