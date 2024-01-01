package practice;

import practice.OrderCommand;

public class PlaceOrderCommand implements OrderCommand {

    private OrderItem orderItem;

    public PlaceOrderCommand(OrderItem orderItem){
        this.orderItem = orderItem;
    }

    @Override
    public void execute() {
        orderItem.placeOrder();
    }
}
