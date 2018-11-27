import java.util.ArrayList;
import java.util.Date;

public interface ManageOrder {

    ArrayList<Order> getOrders(orderStatus status);

    Order getOrder(String title, String sender, Date date);

    void changeOrderStatus(String title, String sender, Date date, orderStatus status);
}
