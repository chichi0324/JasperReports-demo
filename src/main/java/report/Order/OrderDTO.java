package report.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
	List<OrderData> orderDatas=new ArrayList<OrderData>();

	public List<OrderData> getOrderDatas() {
		return orderDatas;
	}

	public void setOrderDatas(List<OrderData> orderDatas) {
		this.orderDatas = orderDatas;
	}
	
	
}
