package com.servlet_jsp;

public class Students {
	int rollno;
	String name;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + "]";
	}
	

}
