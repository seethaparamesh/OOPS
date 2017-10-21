package gradeExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UniversityRentalApartment {

	static ArrayList<Apartment> aptList = new ArrayList<>();
	static int nextStudentId = 1;
	private static final int MAX_STUDENT_PER_APT = 3;
	static int AptAInUse = 0;
	static int AptBInUse = 0;
	static int countOfTypeA;
	static int countOfTypeB;

	private static final double APT_B_MASTER_SURCHARGE = 0.4;

	private static final int UTIL_CHARGE = 100;

	public static void main(String[] args) {

		System.out.println("Enter the number of Type A appts");
		Scanner in = new Scanner(System.in);
		countOfTypeA = in.nextInt();
		System.out.println("Enter the number of Type B appts");
		countOfTypeB = in.nextInt();

		char pick = ' ';

		while (pick != '6') {
			pick = printMenu(in);
			System.out.println("selected :" + pick);
			switch (pick) {
			case '1':
				addStudent(in);
				break;
			case '2':
				removeStudent();
				break;
			case '3':
				searchStudent();
				break;
			case '4':
				apptStatus();
				break;
			case '5':	
				apptStatusReport();
				break;
			default:
				break;
			}
		}

	}

	private static void addStudent(Scanner in) {
		Student student = new Student();
		student.setStudentId(nextStudentId + "");
		student.setStudentName("student" + nextStudentId);
		nextStudentId++;
		student.setDateOfRegistration(new Date());
		System.out.println("Enter choice of appt :");
		String type = in.next();
		boolean foundSpotForNewStudent = false;
		double currentMonthBill = 0.0;
		for (Apartment appt : aptList) { // look into all existing appt first
			if (appt.getAptType().equalsIgnoreCase(type)) {
				int noOfStudentInThisApt = appt.getStudentList().size();
				if (noOfStudentInThisApt <= MAX_STUDENT_PER_APT) {
					// appt is avaible
					appt.getStudentList().add(student);
					System.out.println("the student has been successfully added ");
					currentMonthBill = getRent(appt);
					foundSpotForNewStudent = true;
					break;
				} else {
					continue;
				}
			} else {
				continue;
			}
		}

		if (!foundSpotForNewStudent) {
			int noOfApptofTypeChosen = (type.equals("A")) ? AptAInUse : AptBInUse;
			int maxAllowed = (type.equals("A")) ? countOfTypeA : countOfTypeB;
			if (noOfApptofTypeChosen <= maxAllowed) {
				Apartment appt = new Apartment(type);
				appt.getStudentList().add(student);
				currentMonthBill = getRent(appt);
				aptList.add(appt);
				if (type.equals("A"))
					AptAInUse++;
				else
					AptBInUse++;
			}

		}

	}
	// prints cost of stay

	private static double getRent(Apartment appt) {
		double currentMonthBill = 0.0;
		if (appt.getAptType().equals("A"))
			currentMonthBill = UTIL_CHARGE + (2 * appt.getMonthlyRent());
		else {
			if (appt.getStudentList().size() == 1)
				currentMonthBill = UTIL_CHARGE + (2 * appt.getMonthlyRent() * APT_B_MASTER_SURCHARGE);
			else
				currentMonthBill = UTIL_CHARGE + (2 * appt.getMonthlyRent());
		}
		System.out.println("the current rent of the apartment is :" + currentMonthBill);
		return currentMonthBill;

	}

	private static void removeStudent() {
		System.out.println("Enter the Id of the student to be removed");
		Scanner in = new Scanner(System.in);
		String givenId = in.next();
		boolean removedStudent = false;
		for (Apartment appt : aptList) {
			for (Student student : appt.getStudentList()) {
				if (student.getStudentId().equals(givenId)) {
					appt.getStudentList().remove(student);
					removedStudent = true;
					break;
				}
			}
			if (removedStudent) {
				System.out.println("Student with the givenId has been removed successfully");
				break;
			}

		}

	}

	private static void searchStudent() {
		System.out.println("Enter the id of the student to be searched:");
		Scanner in = new Scanner(System.in);
		String givenId = in.next();
		boolean foundStudent = false;
		for (Apartment appt : aptList) {
			for (Student student : appt.getStudentList()) {
				if (student.getStudentId().equals(givenId)) {
					System.out.println("student with the given id has been found in" + appt.getAptType() + " apartment ");
					if (appt.getAptType().equals("A")) {
						System.out.println("the givenId lives in apartment A and pays" + appt.getMonthlyRent());
					} else {
						int index = appt.getStudentList().indexOf(student);
						if (index == 0)
							System.out.println("the givenid is the first student in apt B and hence pays "
									+ (appt.getMonthlyRent() + (appt.getMonthlyRent() * APT_B_MASTER_SURCHARGE)));
					}
					foundStudent = true;
					break;
				}
			}
			if (foundStudent) {
				System.out.println("Student  found");
				break;
			}
		}
		if (!foundStudent)
			System.out.println("Student not found");

	}

	private static void apptStatus() {

		int NoOfAsFull = 0, NoOfBsFull = 0, NoOfAshasSpace = 0, NoOfBshasSpace = 0;

		for (Apartment appt : aptList) {
			int noOfStudentInThisApt = appt.getStudentList().size();// apartments
																	// are full
			if (noOfStudentInThisApt == MAX_STUDENT_PER_APT) {
				if (appt.getAptType().equalsIgnoreCase("A"))
					NoOfAsFull++;
				else if (appt.getAptType().equalsIgnoreCase("A"))
					NoOfBsFull++;
              } 
			else { } // apartments are not full 
			
				if (appt.getAptType().equalsIgnoreCase("A"))
					NoOfAshasSpace=countOfTypeA-NoOfAsFull;
				else if (appt.getAptType().equalsIgnoreCase("B"))
					NoOfBshasSpace=countOfTypeB-NoOfBsFull;

			

		}
		System.out.println("Number of A's Full" + NoOfAsFull);
		System.out.println("Number of B's Full" + NoOfBsFull);
		System.out.println("Number of A's has space" + NoOfAshasSpace);
		System.out.println("Number of B's has space" + NoOfBshasSpace);

	}

	boolean apptAvailable = true;

	private static void apptStatusReport(){
		System.out.println("enter the studentId of the student to be checked for apptstatus:");
		Scanner in = new Scanner(System.in);
		String givenId = in.next();
		Date todaysdate=new Date();
		Date tomorrow = new Date(todaysdate.getTime() + (1000 * 60 * 60 * 24));
		for (Apartment appt : aptList) {
			for (Student student : appt.getStudentList()) {
				if (student.getStudentId().equals(givenId)){
					if(student.getDateOfExpiry().before(tomorrow)){
						System.out.println(student.getDateOfRegistration());
						System.out.println(student.getDateOfExpiry());
						System.out.println("the student needs to vacate the room ");
					}
					else
						System.out.println("the student need not vacate the room yet");
				}
			}
		}
		
		
	}
	
	public static char printMenu(Scanner in) {
		System.out.println("============================");
		System.out.println("             MENU           ");
		System.out.println("============================");
		System.out.println("1. Add Student");
		System.out.println("2. Remove Student");
		System.out.println("3. Search Student");
		System.out.println("4. Print Appt Status");
		System.out.println("5. Generate Appt Status Report");
		System.out.println("6.Exit");
		String pick = null;
		do {
			pick = in.nextLine();
		} while (pick.length() < 1);
		return pick.charAt(0);
	}

}
