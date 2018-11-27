import javax.naming.directory.SearchResult;
import java.io.Serializable;
import java.util.Date;

public class Order extends Message implements Serializable {
    private orderStatus status;

    public Order(String title,String text,String sender, Date date){
        super(title,text,sender,date);
        status = orderStatus.NEW;
    }

    public orderStatus getStatus() {
        return status;
    }
    public void setStatus(orderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "Status: " + status.toString() + '\n';
        return info;
    }

}
