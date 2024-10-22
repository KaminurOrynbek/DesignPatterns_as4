package State;

public class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped. Moving to Shipped state.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. It must be shipped first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel the order. It's already paid.");
    }
}
