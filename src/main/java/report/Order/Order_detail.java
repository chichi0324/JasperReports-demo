package report.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.jasper.Jasper_Name;
import report.jasper.MyJasperReport;

public class Order_detail  extends MyJasperReport{
	
	List<Order_detailData> orderDetails=new ArrayList<Order_detailData>();
		
	public Order_detail() {
		super();
		jasperName = Jasper_Name.Order_detail.toString();
	}
	
	public List<Order_detailData> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<Order_detailData> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
    protected void loadData() {
    }

    @Override
    protected Map<String, Object> toJasperParams() {
        final Map<String, Object> parameters = new HashMap<String, Object>();       
        return parameters;
    }
    
    @Override
	protected List<Map<String, Object>> convertToDataList() {
    	final List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
    	
    	orderDetails.forEach(orderDetail->{
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("product", orderDetail.getProduct());
    		map.put("qty", orderDetail.getQty());
    		map.put("price", orderDetail.getPrice());
    		listMap.add(map);
    	});
		return listMap;
	};

	
}
