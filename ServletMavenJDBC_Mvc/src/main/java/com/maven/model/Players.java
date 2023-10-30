package com.maven.model;

public class Players {

	private int pid;
	private String fristname;
	private String lastname;
	private String sports;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	@Override
	public String toString() {
		return "Players [pid=" + pid + ", fristname=" + fristname + ", lastname=" + lastname + ", sports=" + sports
				+ "]";
	}
	
	
	
}
