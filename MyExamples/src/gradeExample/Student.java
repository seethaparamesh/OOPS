package gradeExample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Student {
	
	private static final int STAY_DURATION_DAYS = 140;
	private String studentName;
	private ArrayList<Integer> grades = new ArrayList<>();
	private double average;
	private Date dateOfRegistration;
    private String studentId;
    private Date dateOfExpiry;
    private boolean isFirstOccupant = false;
    
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public char getGrade() {
		if (this.average >= 90)
			return 'A';
		else if (this.average >= 80)
			return 'B';
		else if (this.average >= 70)
			return 'C';
		else if (this.average >= 60)
			return 'D';
		else return 'F';
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grades=" + grades + ", average=" + average + ", grade=" + getGrade() + "]";
	}

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
		Calendar c = Calendar.getInstance();
		c.setTime(dateOfRegistration); // Now use today date.
		c.add(Calendar.DATE, STAY_DURATION_DAYS); // Adding STAY_DURATION_DAYS days
		this.setDateOfExpiry(c.getTime());
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	private void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean isFirstOccupant() {
		return isFirstOccupant;
	}
	public void setFirstOccupant(boolean isFirstOccupant) {
		this.isFirstOccupant = isFirstOccupant;
	}

}
