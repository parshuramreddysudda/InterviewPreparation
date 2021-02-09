package com.wipro.servelst;

public class Candidate {

	private int cid;
	private String name;
	private String Course;

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", name=" + name + ", Course=" + Course + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public Candidate(int cid, String name, String course) {
		super();
		this.cid = cid;
		this.name = name;
		Course = course;
	}

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

}
