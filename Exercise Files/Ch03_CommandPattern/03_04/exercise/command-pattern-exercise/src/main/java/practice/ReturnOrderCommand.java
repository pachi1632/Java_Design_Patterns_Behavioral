package practice;

public class ReturnOrderCommand implements OrderCommand {

    private OrderItem orderItem;

    public ReturnOrderCommand(OrderItem orderItem){
        this.orderItem = orderItem;
    }

    @Override
    public void execute() {
        this.orderItem.returnOrder();
    }
}
