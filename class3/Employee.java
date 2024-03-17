package class3;

public class Employee {
    private int salary;
    public String name;
    protected static String id;
    public String mobileNumber;

    public Employee(){

    }

    public Employee(int salary, String name, String id, String mobileNumber) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.mobileNumber = mobileNumber;
    }
    public void printId() {
        System.out.println("Your id is"+id);
    }

    public void printId(String id){
        System.out.println(id);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1500,"subrata","1122233","01869302452");
        employee.printId();
        employee.printId("1122233");
        System.out.println(employee.salary);
        System.out.println(employee.getMobileNumber());
    }


}
