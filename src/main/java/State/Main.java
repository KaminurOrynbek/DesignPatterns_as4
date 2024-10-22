package State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();


        System.out.println("Scenario 1: Normal order flow");
        order.payOrder();
        order.shipOrder();
        order.deliverOrder();

        System.out.println();

        System.out.println("Scenario 2: Trying to cancel a delivered order");
        order.cancelOrder();

        System.out.println();

        Order anotherOrder = new Order();
        System.out.println("Scenario 3: Cancel an order before it is shipped");
        anotherOrder.cancelOrder();
    }
}
