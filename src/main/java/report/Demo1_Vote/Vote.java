package report.Demo1_Vote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.jasper.Jasper_Name;
import report.jasper.MyJasperReport;
/**
 * Report
 *
 */
public class Vote extends MyJasperReport{
	
	VoteDTO mainDTO=new VoteDTO();	

	public Vote() {
		super();
		jasperName = Jasper_Name.Vote.toString();

	}

	public VoteDTO getMainDTO() {
		return mainDTO;
	}

	public void setMainDTO(VoteDTO mainDTO) {
		this.mainDTO = mainDTO;
	}

	@Override
    protected void loadData() {
//		List<MemberData> memberDatas=new ArrayList<MemberData>();
//		memberDatas.add(new MemberData(new BigDecimal(1),"王大明",new BigDecimal(142)));
//		memberDatas.add(new MemberData(new BigDecimal(2),"李曉芬",new BigDecimal(201)));
//		memberDatas.add(new MemberData(new BigDecimal(3),"莊志豪",new BigDecimal(67)));
//		
//		mainDTO.setMemberDatas(memberDatas);
    }

    @Override
    protected Map<String, Object> toJasperParams() {
        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("reportNo", "社區代表選舉結果");
        return parameters;
    }
    
    @Override
	protected List<Map<String, Object>> convertToDataList() {
    	final List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
    	
    	mainDTO.getVoteDatas().forEach(voteData->{
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("no", voteData.getNo());
    		map.put("name", voteData.getName());
    		map.put("count", voteData.getCount());
    		listMap.add(map);
    	});
		return listMap;
	};
}
