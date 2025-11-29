package CafeOOP;
import java.util.ArrayList;
import java.util.List;
class Order {
    private List<OrderItem> orderItems;

    public Order() {
        this.orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalBill() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getTotalPrice();
        }
        return total;
    }
}

