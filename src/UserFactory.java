public class UserFactory {
    private static int nextTicketNumber = 101;

    public static User createUser(String type, String name) {
        if (type.equalsIgnoreCase("customer")) {
            return new Customer(name, nextTicketNumber++);
        } else if (type.equalsIgnoreCase("owner")) {
            return new BusinessOwner(name);
        }
        return null;
    }
}
