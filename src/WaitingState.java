public class WaitingState implements CustomerState {

    @Override
    public void handle(Customer customer) {
        System.out.println(customer.getName() + " is waiting in the queue.");
    }
}