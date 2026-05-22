public class Main {

    public static void main(String[] args) {

        QueueManager queueManager = QueueManager.getInstance();

        Customer c1 = (Customer) UserFactory.createUser("customer", "John");
        Customer c2 = (Customer) UserFactory.createUser("customer", "Sarah");

        queueManager.addCustomer(c1);
        queueManager.addCustomer(c2);

        c1.showState();
        c2.showState();

        queueManager.serveNextCustomer();
    }
}
