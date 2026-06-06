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
            System.out.println("4. Cancel Next Customer");
            System.out.println("5. Show Statistics");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from 1 to 6.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
                        System.out.println("Customer name cannot be empty.");
                        break;
                    }

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
                    queueManager.cancelNextCustomer();
                    break;

                case 5:
                     Command command = new ShowStatisticsCommand(queueManager);
                     command.execute();
                     break;

                case 6:
                    running = false;
                    System.out.println("Closing NoLine System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }

        scanner.close();
    }
}
