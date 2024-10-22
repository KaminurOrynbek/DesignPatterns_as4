package Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.confirmPayment(100.0);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.confirmPayment(200.0);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.confirmPayment(300.0);
    }
}
