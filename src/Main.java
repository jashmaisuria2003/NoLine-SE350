import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueManager queueManager = QueueManager.getInstance();

        BusinessOwner owner =
                (BusinessOwner) UserFactory.createUser("owner", "Cafe Owner");

        System.out.println(" Hi! Welcome to NoLine Queue System ");
        System.out.println(owner.getName() + " opened the queue.");

        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    Customer customer =
                            (Customer) UserFactory.createUser("customer", name);

                    queueManager.addCustomer(customer);
                    break;

                case 2:
                    queueManager.serveNextCustomer();
                    break;

                case 3:
                    queueManager.showQueue();
                    break;

                case 4:
                    running = false;
                    System.out.println("Closing NoLine System...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
