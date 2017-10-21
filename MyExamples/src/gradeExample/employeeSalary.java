package gradeExample;

import java.util.Scanner;

public class employeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the hourly wage of the employee");
Scanner in = new Scanner(System.in);// constructor to accept user input
int hourlyWage = in.nextInt();//get the hourly wage of the employee from the user
System.out.println("Enter the number of hours the employee has worked");
int hoursWorked=in.nextInt();
double tax=0.15;
double grossPay=(hourlyWage*hoursWorked);
double netPay=grossPay-(tax*grossPay);
System.out.println("The gross and net pay of the employee are:"+ grossPay +" and " + netPay);


	}

}
