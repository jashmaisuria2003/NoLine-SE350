public class CancelledState implements CustomerState {

    @Override
    public void handle(Customer customer) {
        System.out.println(customer.getName() + " cancelled the queue.");
    }
}