package report.Demo1_Vote;

import java.math.BigDecimal;

public class VoteData {
	BigDecimal no;
	String name;
	BigDecimal count;
	
	public VoteData(BigDecimal no, String name, BigDecimal count) {
		super();
		this.no = no;
		this.name = name;
		this.count = count;
	}

	public BigDecimal getNo() {
		return no;
	}

	public void setNo(BigDecimal no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}	
	
	
}
