import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueManager queueManager = QueueManager.getInstance();

        BusinessOwner owner =
                (BusinessOwner) UserFactory.createUser("owner", "Cafe Owner");

        System.out.println(ConsoleColors.BLUE + "==========================================");
        System.out.println("          NoLine Queue System");
        System.out.println("==========================================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + owner.getName() + " opened the queue." + ConsoleColors.RESET);

        boolean running = true;

        while (running) {
            System.out.println(ConsoleColors.CYAN + "\n------------------------------------------");
            System.out.println("Business: " + owner.getName());
            System.out.println("------------------------------------------" + ConsoleColors.RESET);
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Show Queue");
            System.out.println("4. Cancel Next Customer");
            System.out.println("5. Show Statistics");
            System.out.println("6. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println(ConsoleColors.RED + "Invalid input. Please enter a number from 1 to 6." + ConsoleColors.RESET);
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
                        System.out.println(ConsoleColors.YELLOW + "Customer name cannot be empty." + ConsoleColors.RESET);
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
                    System.out.println(ConsoleColors.GREEN + "Closing NoLine System..." + ConsoleColors.RESET);
                    break;

                default:
                    System.out.println(ConsoleColors.RED + "Invalid choice. Please enter a number from 1 to 6." + ConsoleColors.RESET);
            }
        }

        scanner.close();
    }
}