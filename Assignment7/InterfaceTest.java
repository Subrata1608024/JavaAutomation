package Assignment7;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("Ebl object: " +EblBank.routingNumber);

        EblBank eblBank = new EblBank();
        eblBank.cashIn();
        eblBank.cashOut();
        eblBank.transfer();



        System.out.println("Bank object: "+InterfaceBank.routingNumber);

        InterfaceBank interfaceBank = new EblBank();
        interfaceBank.cashIn();
        interfaceBank.cashOut();
        interfaceBank.transfer();



    }
}
