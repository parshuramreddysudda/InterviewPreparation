package com.wipro.entity;

public class Candidate {
	private String cname;
	private String intrests;
	public Candidate() {
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getIntrests() {
		return intrests;
	}
	public void setIntrests(String intrests) {
		this.intrests = intrests;
	}
	public Candidate(String cname, String intrests) {
		super();
		this.cname = cname;
		this.intrests = intrests;
	}
	@Override
	public String toString() {
		return "Candidate [cname=" + cname + ", intrests=" + intrests + "]";
	}

}
