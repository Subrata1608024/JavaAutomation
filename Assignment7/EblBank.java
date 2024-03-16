package Assignment7;

public class EblBank implements InterfaceBank{
    @Override
    public void cashIn() {
        System.out.println("Cash in amount");
    }

    @Override
    public void cashOut() {
        System.out.println("Cash out amount");
    }

    @Override
    public void transfer() {
        System.out.println("Amount transferred");

    }
    public void state(){
        System.out.println("Your balance is:115000");
    }
}
