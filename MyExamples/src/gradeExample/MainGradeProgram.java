package gradeExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainGradeProgram {

	public static void main(String[] args) {
		System.out.println("Enter Number of Students : ");
		Scanner in1 = new Scanner(System.in);
		int noOfStudents = in1.nextInt();
		System.out.println("Enter Number of Courses : ");
		int noOfCourses = in1.nextInt();
		int countOfA = 0;
		double sumOfAvg = 0.0;
		ArrayList<Student> studentList = new ArrayList<>();
		Random rand = new Random(System.currentTimeMillis());
		for (int studentLoop = 0; studentLoop < noOfStudents; studentLoop++) {
			Student student = new Student();
			double sumOfGrades = 0.0;
			student.setStudentName(studentLoop + "");
			ArrayList<Integer> grades = new ArrayList<>();
			for (int courseLoop = 0; courseLoop < noOfCourses; courseLoop++) {
				//int grade = in1.nextInt();
				int grade = 0;
				do {
				 grade = rand.nextInt(100);
				} while (grade < 60);
				sumOfGrades += grade;
				grades.add(new Integer(grade));
			}
			student.setGrades(grades);
			double avg = sumOfGrades / noOfCourses;
			student.setAverage(avg);
			sumOfAvg += avg;
			
			if (student.getGrade() == 'A')
				countOfA++;
			studentList.add(student);
		}
		double avgOfAvg = sumOfAvg / noOfStudents;
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			//System.out.println(student);
		}
		System.out.println("the average of the class is " + avgOfAvg);
		System.out.println("the number of students with an 'A' are:" + countOfA);
		
		try {
		     File file = new File("C:\\Users\\Seetha\\Desktop\\out.txt");
		    boolean fvar = file.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }

				BufferedWriter bw = null;
				FileWriter fw = null;
                //String content = "This is the content to write into file\n";
                    fw = new FileWriter(file);
					bw = new BufferedWriter(fw);
					bw.write(countOfA);
                    System.out.println("Done");
                    bw.close();
                    fw.close();
				 
	    	} 
		catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		        in1.close();

	           }
		//private static final String FILENAME = "E:\\test\\filename.txt";

		
			} 

	


}


