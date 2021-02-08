package service;

import com.wipro.desc.CandidateDOA;
import com.wipro.entity.Candidate;

public class CandidateService {
	@SuppressWarnings("null")
	
	CandidateDOA cd=new CandidateDOA();
	public String addCandidate(Candidate ob) {

		if (ob != null || ob.getCname() != null) {
			return "Success";
		}
		return null;

	}

	public CandidateService() {

	}

}
