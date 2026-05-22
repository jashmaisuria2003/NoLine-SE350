public class UserFactory {
    public static User createUser(String type, String name) {
        if (type.equalsIgnoreCase("customer")) {
            return new Customer(name);
        } else if (type.equalsIgnoreCase("owner")) {
            return new BusinessOwner(name);
        }
        return null;
    }
}
