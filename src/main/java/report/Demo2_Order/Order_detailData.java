package report.Demo2_Order;

import java.math.BigDecimal;

public class Order_detailData {

	String product;
	BigDecimal qty;
	BigDecimal price;
	
	public Order_detailData(String product, BigDecimal qty, BigDecimal price) {
		super();
		this.product = product;
		this.qty = qty;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
