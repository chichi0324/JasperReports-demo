package report.Demo3_Grage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.jasper.Jasper_Name;
import report.jasper.MyJasperReport;
/**
 * Report+Group+Variable
 *
 */
public class Grade extends MyJasperReport{
	
	GradeDTO mainDTO=new GradeDTO();	

	public Grade() {
		super();
		jasperName = Jasper_Name.Grade.toString();

	}

	public GradeDTO getMainDTO() {
		return mainDTO;
	}

	public void setMainDTO(GradeDTO mainDTO) {
		this.mainDTO = mainDTO;
	}

	@Override
    protected void loadData() {

    }

    @Override
    protected Map<String, Object> toJasperParams() {
        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("reportNo", "三年級各班數學分數");
        return parameters;
    }
    
    @Override
	protected List<Map<String, Object>> convertToDataList() {
    	final List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
    	
    	mainDTO.getGradeDatas().forEach(grade->{
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("className", grade.getClassName());
    		map.put("name", grade.getName());
    		map.put("grade", grade.getGrade());
    		listMap.add(map);
    	});
		return listMap;
	};
}
