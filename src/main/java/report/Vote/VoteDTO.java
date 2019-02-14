package report.Vote;

import java.util.ArrayList;
import java.util.List;

public class VoteDTO {
	
	List<VoteData> voteDatas=new ArrayList<>();

	public List<VoteData> getVoteDatas() {
		return voteDatas;
	}

	public void setVoteDatas(List<VoteData> voteDatas) {
		this.voteDatas = voteDatas;
	}
	
	
}
