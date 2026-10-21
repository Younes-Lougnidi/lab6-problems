package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(new Customer("Alice"));
        bank.addTransaction(c1, 150.50);
        bank.addTransaction(c1, -25.00);
        bank.addTransaction(c2, 500.00);
        bank.addTransaction(c2, -120.75);
        bank.addTransaction(new Customer("Charlie"), 100.00);
        System.out.println("\nBank Statements");
        bank.print();
    }
}
