package State;

public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order paid. Moving to Paid state.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship the order. Payment required first.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. Payment required first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }
}
