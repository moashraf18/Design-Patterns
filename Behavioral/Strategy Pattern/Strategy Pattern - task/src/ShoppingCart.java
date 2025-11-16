import java.util.ArrayList;

public class ShoppingCart {
    private IPaymentMethods paymentMethods;
    ArrayList<Integer> items;

    public ShoppingCart(IPaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
        items = new ArrayList<>();
    }

    public void addItem(int item) {
        items.add(item);
    }

    public void TotalCost() {
        int totalCost = items.size() * 100;
        System.out.println("Total Cost: " + totalCost);
    }

    public void PaymentMethod() {
        System.out.println("Payment Methode: " + paymentMethods.paymentMethod());
    }
}
