public class OnlineShopCheckoutSystem {
    private Inventory inventory;
    private PricingSystem pricingSystem;
    private PaymentGateway paymentGateway;
    private ShippingService shippingService;

    public OnlineShopCheckoutSystem() {
        inventory = new Inventory();
        pricingSystem = new PricingSystem();
        paymentGateway = new PaymentGateway();
        shippingService = new ShippingService();
    }

    public void placeOrder(String productName) {
        inventory.CheckProductAvailability();
        pricingSystem.CalculatePrice();
        paymentGateway.ProcessPayment();
        shippingService.ProductShipping();
        System.out.println("\n" + productName + " Placed Successfully!");
    }
}