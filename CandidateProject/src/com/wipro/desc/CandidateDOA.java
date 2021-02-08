package com.wipro.desc;

import java.sql.Connection;

import com.wipro.entity.Candidate;
import com.wipro.util.DBConnection;

public class CandidateDOA {

	Connection con=DBConnection.getDBConnection();
	
	public int addCandiadate(Candidate candidate) {
		
		try {
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	public CandidateDOA() {
		// TODO Auto-generated constructor stub
	}
	
	public Candidate getCandidate(String cname)
	{
		try {
			return new Candidate("23","asdasd");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
