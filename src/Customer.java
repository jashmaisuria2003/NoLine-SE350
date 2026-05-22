public class Customer extends User implements QueueObserver {
    private CustomerState state;

    public Customer(String name) {
        super(name);
        state = new WaitingState();
    }

    public void setState(CustomerState state) {
        this.state = state;
    }

    public void showState() {
        state.handle(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
