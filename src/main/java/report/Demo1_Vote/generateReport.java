package report.Demo1_Vote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import report.jasper.Jasper_Name;

public class generateReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteDTO mainDTO=new VoteDTO();
		
		List<VoteData> voteDatas=new ArrayList<VoteData>();
		voteDatas.add(new VoteData(new BigDecimal(1),"王大明",new BigDecimal(142)));
		voteDatas.add(new VoteData(new BigDecimal(2),"李曉芬",new BigDecimal(201)));
		voteDatas.add(new VoteData(new BigDecimal(3),"莊志豪",new BigDecimal(67)));
		
		mainDTO.setVoteDatas(voteDatas);
		
		//======================================================================
		
		Vote vote=new Vote();
		vote.setMainDTO(mainDTO);
		vote.generateReport();
	}

}
