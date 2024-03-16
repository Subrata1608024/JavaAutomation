package Assignment7;

public interface InterfaceBank {

    int routingNumber = 56821;

    void cashIn();

    void cashOut();

    void transfer();

    public default void balanceState(){
        System.out.println("Your account balance is : 150000");
    }



}
