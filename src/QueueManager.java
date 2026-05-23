import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private static QueueManager instance;

    private Queue<Customer> queue;
    private ArrayList<QueueObserver> observers;
    private QueueStrategy strategy;

    private int servedCount;
    private int cancelledCount;

    private QueueManager() {
        queue = new LinkedList<>();
        observers = new ArrayList<>();
        strategy = new FIFOQueueStrategy();
        servedCount = 0;
        cancelledCount = 0;
    }

    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        strategy.addCustomer(queue, customer);
        observers.add(customer);

        notifyObservers(customer.getName() + " joined the queue with Ticket #" + customer.getTicketNumber());
    }

    public void serveNextCustomer() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            customer.setState(new ServedState());
            customer.showState();
            servedCount++;

            notifyObservers("Ticket #" + customer.getTicketNumber() + " - " + customer.getName() + " was served.");
        } else {
            System.out.println("No customers are currently in the queue.");
        }
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("\nCurrent Queue:");
        int position = 1;

        for (Customer customer : queue) {
            int estimatedWait = (position - 1) * 5;
            System.out.println(position + ". Ticket #" + customer.getTicketNumber()
                    + " - " + customer.getName()
                    + " | Estimated wait: " + estimatedWait + " minutes");
            position++;
        }
    }

    public void showStatistics() {
        System.out.println("\nQueue Statistics:");
        System.out.println("Queue Strategy: " + strategy.getStrategyName());
        System.out.println("Customers Waiting: " + queue.size());
        System.out.println("Customers Served: " + servedCount);
        System.out.println("Customers Cancelled: " + cancelledCount);
    }

    public void cancelNextCustomer() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            customer.setState(new CancelledState());
            customer.showState();
            cancelledCount++;

            notifyObservers("Ticket #" + customer.getTicketNumber() + " - " + customer.getName()
                    + " cancelled their place in line.");
        } else {
            System.out.println("No customers to cancel.");
        }
    }

    public void notifyObservers(String message) {
        for (QueueObserver observer : observers) {
            observer.update(message);
        }
    }
}
