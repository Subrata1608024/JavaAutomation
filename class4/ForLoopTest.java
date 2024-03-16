package class4;

public class ForLoopTest {
    public static void main(String[] args) {
        for(int i=10; i>=0;--i){
            System.out.println("Print "+i);
        }
        System.out.println("========================================");
        for(int i=20; i>=0;i--){
            i -=3;
            System.out.println("Print2 "+i);
        }
    }
}
