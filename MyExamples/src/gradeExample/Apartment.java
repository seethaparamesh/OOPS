package gradeExample;

import java.util.ArrayList;

public class Apartment {
	private static final int APT_A_RENT = 300;
	private static final int APT_B_RENT = 200;
	
 private String aptType;
 private int monthlyRent;
 private ArrayList<Student>  studentList;
 private int deposit;
 
 
public Apartment(String type) {
	this.aptType=type;
	if (this.aptType.equals("A"))
		this.monthlyRent=APT_A_RENT;
	else 
		this.monthlyRent=APT_B_RENT;
	this.studentList = new ArrayList<>();
}

public String getAptType() {
	return aptType;
}
public void setAptType(String aptType) {
	this.aptType = aptType;
}
public int getMonthlyRent() {
	return monthlyRent;
}
public void setMonthlyRent(int monthlyRent) {
	this.monthlyRent = monthlyRent;
}
public ArrayList<Student> getStudentList() {
	return studentList;
}
public void setStudentList(ArrayList<Student> studentList) {
	this.studentList = studentList;
}
 
}
