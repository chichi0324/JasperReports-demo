package report.Demo3_Grage;

import java.math.BigDecimal;

public class GradeData {
	
	String className;
	String name;
	BigDecimal grade;
	
	public GradeData(String className, String name, BigDecimal grade) {
		super();
		this.className = className;
		this.name = name;
		this.grade = grade;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getGrade() {
		return grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}
	
	
}
