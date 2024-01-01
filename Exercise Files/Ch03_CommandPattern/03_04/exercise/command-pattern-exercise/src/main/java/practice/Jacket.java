package practice;

public class Jacket implements OrderItem {

  @Override
  public void placeOrder() {
    System.out.println("Jacket order has been placed");
  }

  @Override
  public void returnOrder() {
    System.out.println("Jacket order has been returned");
  }

}
