public class ServedState implements CustomerState {
    @Override
    public void handle(Customer customer) {
        System.out.println(customer.getName() + " has been served.");
    }
}
