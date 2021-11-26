package com.encapsulation;

public class Student {
	
	private String name;
	private int Student_id;
	private double phoneno;
	private String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public double getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//The toString() method returns the string representation of the object.
	@Override
	public String toString() {
		return "Student [name=" + name + ", Student_id=" + Student_id + ", phoneno=" + phoneno + ", state=" + state
				+ "]";
	}
	public Student(String name, int student_id, double phoneno, String state) {
		super();
		this.name = name;
		Student_id = student_id;
		this.phoneno = phoneno;
		this.state = state;
	}
	
	

}
