package Class6;

public class OverridingTesting {
    public static void main(String[] args) {
        CityBank cityBank = new CityBank();
        cityBank.printInterestRate();

        BangladeshBank bangladeshBank = new CityBank();
        bangladeshBank.printInterestRate();

        BracBank bracBank = new BracBank();
        bracBank.printInterestRate();
    }
}
