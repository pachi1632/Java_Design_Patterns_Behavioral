package practice;

public class OrderHandler {

  public void invoke(OrderCommand orderCommand) {
    orderCommand.execute();
  }

}
