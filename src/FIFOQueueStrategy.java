public class FIFOQueueStrategy implements QueueStrategy {
    @Override
    public void addCustomer(java.util.Queue<Customer> queue, Customer customer) {
        queue.add(customer);
    }

    @Override
    public String getStrategyName() {
        return "First Come First Served";
    }
}
