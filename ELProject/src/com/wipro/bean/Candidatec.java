package com.wipro.bean;

public class Candidatec {

	private int  cid;
	private String name;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Candidatec [cid=" + cid + ", name=" + name + "]";
	}

	public String getName() {
		System.out.println("Cname os called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Candidatec(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	public Candidatec() {
		// TODO Auto-generated constructor stub
	}

}
