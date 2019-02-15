package report.Demo3_Grage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import report.jasper.Jasper_Name;

public class generateReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDTO mainDTO=new GradeDTO();
		
		List<GradeData> gradeDatas=new ArrayList<GradeData>();
		gradeDatas.add(new GradeData("三年甲班","王大明",new BigDecimal(45)));
		gradeDatas.add(new GradeData("三年甲班","李曉芬",new BigDecimal(65)));
		gradeDatas.add(new GradeData("三年甲班","莊志豪",new BigDecimal(70)));
		gradeDatas.add(new GradeData("三年甲班","李大白",new BigDecimal(80)));
		gradeDatas.add(new GradeData("三年甲班","王美美",new BigDecimal(99)));
		
		gradeDatas.add(new GradeData("三年乙班","朱櫻",new BigDecimal(30)));
		gradeDatas.add(new GradeData("三年乙班","劉明家",new BigDecimal(65)));
		gradeDatas.add(new GradeData("三年乙班","王怡君",new BigDecimal(68)));
		gradeDatas.add(new GradeData("三年乙班","徐志翰",new BigDecimal(70)));
		gradeDatas.add(new GradeData("三年乙班","吳俊傑",new BigDecimal(79)));
		
		gradeDatas.add(new GradeData("三年丙班","李嘉嘉",new BigDecimal(29)));
		gradeDatas.add(new GradeData("三年丙班","莊英豪",new BigDecimal(69)));
		gradeDatas.add(new GradeData("三年丙班","許邵齡",new BigDecimal(86)));
		gradeDatas.add(new GradeData("三年丙班","林俊英",new BigDecimal(90)));
		gradeDatas.add(new GradeData("三年丙班","劉宇玲",new BigDecimal(97)));
		
		mainDTO.setGradeDatas(gradeDatas);
		
		//======================================================================
		
		Grade grade=new Grade();
		grade.setMainDTO(mainDTO);
		grade.generateReport();
	}

}
