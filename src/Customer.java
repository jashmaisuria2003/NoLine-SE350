public class Customer extends User implements QueueObserver {
    private CustomerState state;
    private int ticketNumber;

    public Customer(String name, int ticketNumber) {
        super(name);
        this.ticketNumber = ticketNumber;
        state = new WaitingState();
    }

    public int getTicketNumber() {
        return ticketNumber;
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
