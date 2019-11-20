package Tools;

public class Customer {
    String name;
    Address address;

    private class Address {
        Customer customer = new Customer();
    }
}
