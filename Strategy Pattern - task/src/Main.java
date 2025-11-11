public class Main {
    public static void main(String[] args) {
        IPaymentMethods creditCard = new CreditCard();
        IPaymentMethods payPal = new PayPal();
        ShoppingCart shoppingCart = new ShoppingCart(creditCard);
        shoppingCart.addItem(1);
        shoppingCart.addItem(2);
        shoppingCart.addItem(3);
        shoppingCart.TotalCost();
        shoppingCart.PaymentMethod();

        shoppingCart = new ShoppingCart(payPal);
        shoppingCart.addItem(1);
        shoppingCart.addItem(2);
        shoppingCart.addItem(3);
        shoppingCart.addItem(4);
        shoppingCart.TotalCost();
        shoppingCart.PaymentMethod();
    }
}