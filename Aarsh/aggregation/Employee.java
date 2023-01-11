package aarsh.aggregation;

public class Employee {
    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("The name of the employee is: " + name);
        System.out.println("The city of the employee is: " + address.city);
        System.out.println("The state of the employee is: " + address.state);
        System.out.println("The country of the employee is: " + address.country);
        System.out.println("The pincode of the employee is: " + address.pincode);
    }

    public static void main(String[] args) {
        Address a1 = new Address("Ahmedabad", "Gujarat", "India", 380008);
        Employee e1 = new Employee("Aarsh", a1);
        e1.display();
    }
}
