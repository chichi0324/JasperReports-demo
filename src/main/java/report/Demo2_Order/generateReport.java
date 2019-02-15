package report.Demo2_Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class generateReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderDTO mainDTO=new OrderDTO();
		
		List<OrderData> orderDatas=new ArrayList<OrderData>();
		
		List<Order_detailData> Order_detailDatas=new ArrayList<Order_detailData>();
		Order_detailDatas.add(new Order_detailData("電風扇",new BigDecimal(1),new BigDecimal(650)));
		Order_detailDatas.add(new Order_detailData("望遠鏡",new BigDecimal(1),new BigDecimal(1350)));
		Order_detailDatas.add(new Order_detailData("滑鼠",new BigDecimal(1),new BigDecimal(220)));
		
		orderDatas.add(new OrderData("0024343543","王大明","2016/03/15",Order_detailDatas));
		
		
		Order_detailDatas=new ArrayList<Order_detailData>();
		Order_detailDatas.add(new Order_detailData("筆記本",new BigDecimal(1),new BigDecimal(100)));
		
		orderDatas.add(new OrderData("0024343544","李曉芬","2017/06/19",Order_detailDatas));
		
		
		Order_detailDatas=new ArrayList<Order_detailData>();
		Order_detailDatas.add(new Order_detailData("杯子",new BigDecimal(5),new BigDecimal(300)));
		Order_detailDatas.add(new Order_detailData("皮包",new BigDecimal(1),new BigDecimal(500)));
		
		orderDatas.add(new OrderData("0024343544","莊志豪","2017/06/19",Order_detailDatas));
		
		
		mainDTO.setOrderDatas(orderDatas);
		
		//======================================================================
		
		Order order=new Order();
		order.setMainDTO(mainDTO);
		order.generateReport();
	}

}
