package State;

public class ShippedOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered. Moving to Delivered state.");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel the order. It's already shipped.");
    }
}
