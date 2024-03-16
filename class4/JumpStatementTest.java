package class4;

public class JumpStatementTest {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        for(int number:numbers){
            if (number==20) continue;
            System.out.println(number);
        }
    }
}
