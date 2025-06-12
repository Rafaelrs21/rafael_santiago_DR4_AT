package q3;

public class q3 {

    public double calculatePrice(double basePrice, int customerType, boolean holiday) {
        double discount = switch (customerType) {
            case 1 -> 0.10;
            case 2 -> 0.15;
            default -> 0.0;
        };

        if (holiday) {
            discount += 0.05;
        }

        return basePrice * (1 - discount);
    }
}
