package oop_2_5;

public class TestMain {

    public static void main(String[] args) {

        Customer c1 = new Customer(12345, "Fergus Thompson", 'm');
        System.out.println(c1);

        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        Account a1 = new Account(54321, c1, 599.99);
        System.out.println(a1);
        System.out.println("id is: " + a1.getId());
        System.out.println("Customer is: " + a1.getCustomer());
        System.out.println("balance is: " + a1.getBalance());
        a1.setBalance(345.99);
        System.out.println(a1);
        System.out.println("Customer name is: " + a1.getCustomerName());

        a1.deposit(100);
        System.out.println(a1);
        a1.withdraw(100);
        System.out.println(a1);
        a1.withdraw(500);


    }

}
