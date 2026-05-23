public interface QueueStrategy {
    void addCustomer(java.util.Queue<Customer> queue, Customer customer);
    String getStrategyName();
}
