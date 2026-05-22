import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private static QueueManager instance;

    private Queue<Customer> queue;
    private ArrayList<QueueObserver> observers;

    private QueueManager() {
        queue = new LinkedList<>();
        observers = new ArrayList<>();
    }

    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        observers.add(customer);
        notifyObservers(customer.getName() + " joined the queue.");
    }

    public void serveNextCustomer() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            customer.setState(new ServedState());
            customer.showState();
            notifyObservers(customer.getName() + " was served.");
        } else {
            System.out.println("No customers are currently in the queue.");
        }
    }

    public void cancelCustomer(Customer customer) {
        customer.setState(new CancelledState());
        customer.showState();
        notifyObservers(customer.getName() + " cancelled their place in line.");
    }

    public void notifyObservers(String message) {
        for (QueueObserver observer : observers) {
            observer.update(message);
        }
    }
}
