package report.Demo2_Order;

import java.util.ArrayList;
import java.util.List;

public class OrderData {

	String orderNo;
	String consumer;
	String orderDate;
	List<Order_detailData> Order_detailDatas=new ArrayList<Order_detailData>();
	
	public OrderData(String orderNo, String consumer, String orderDate, List<Order_detailData> order_detailDatas) {
		super();
		this.orderNo = orderNo;
		this.consumer = consumer;
		this.orderDate = orderDate;
		Order_detailDatas = order_detailDatas;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<Order_detailData> getOrder_detailDatas() {
		return Order_detailDatas;
	}

	public void setOrder_detailDatas(List<Order_detailData> order_detailDatas) {
		Order_detailDatas = order_detailDatas;
	}


}
