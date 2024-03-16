package class4;

public class BreakStatementTest {
    public static void main(String[] args) {
        String[] names={"joy","subrata","shawon","supto"};
                for(String n:names){
                    if(n=="shawon") break;
                        System.out.println(n);
                }
    }
}
