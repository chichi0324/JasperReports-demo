package report.Demo2_Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.jasper.Jasper_Name;
import report.jasper.MyJasperReport;

/**
 * Report+SubReport
 *
 */
public class Order extends MyJasperReport{
	
	Order_detail order_detail=new Order_detail();
	OrderDTO mainDTO=new OrderDTO();
	
	public Order() {
		super();
		jasperName = Jasper_Name.Order.toString();
	}
	
	public OrderDTO getMainDTO() {
		return mainDTO;
	}

	public void setMainDTO(OrderDTO mainDTO) {
		this.mainDTO = mainDTO;
	}

	public Order_detail getOrder_detail() {
		return order_detail;
	}

	public void setOrder_detail(Order_detail order_detail) {
		this.order_detail = order_detail;
	}

	@Override
    protected void loadData() {

    }

    @Override
    protected Map<String, Object> toJasperParams() {
        final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("reportNo", "有錢公司訂購單");		
		parameters.put("SUBREPORT1", order_detail.getJasperReport());
        return parameters;
    }
    
    @Override
	protected List<Map<String, Object>> convertToDataList() {
    	final List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
    	
    	mainDTO.getOrderDatas().forEach(order->{
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("orderNo", order.getOrderNo());
    		map.put("consumer", order.getConsumer());
    		map.put("orderDate", order.getOrderDate());    		
    		order_detail.setOrderDetails(order.getOrder_detailDatas());
    		map.put("LIST1", order_detail.toDataSource());
    		listMap.add(map);
    	});
		return listMap;
	};
}
