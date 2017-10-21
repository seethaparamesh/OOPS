import java.util.Scanner;

public class studentGrades {

	public static void main(String[] args) {
		
System.out.println("enter the 5 grades of the students");
Scanner in1 =new Scanner(System.in);
float grade1=in1.nextFloat();
Scanner in2 =new Scanner(System.in);
float grade2=in2.nextFloat();
Scanner in3 =new Scanner(System.in);
float grade3=in3.nextFloat();
Scanner in4 =new Scanner(System.in);
float grade4=in4.nextFloat();
Scanner in5 =new Scanner(System.in);
float grade5=in5.nextFloat();
if((grade1>=90 && grade1<=100)||(grade2>=90 && grade2<=100)||(grade3>=90 && grade3<=100)||(grade4>=90 && grade4<=100)||(grade5>=90 && grade5<=100))
{
	System.out.println("A grade");
}
else if((grade1>=80 && grade1<=89)||(grade2>=80 && grade2<=89)||(grade3>=80 && grade3<=89)||(grade4>=80 && grade4<=89)||(grade5>=80 && grade5<=89))
{
	System.out.println("B grade");
}
else if((grade1>=70 && grade1<=79)||(grade2>=70 && grade2<=79)||(grade3>=70 && grade3<=79)||(grade4>=70 && grade4<=79)||(grade5>=70 && grade5<=79))
{
	System.out.println("c grade");
	
}
else if((grade1>=60 && grade1<=69)||(grade2>=60 && grade2<=169)||(grade3>=60 && grade3<=69)||(grade4>=60 && grade4<=69)||(grade5>=60 && grade5<=69))
{
	System.out.println("D grade");
}
else
	System.out.println("F grade :(");

float sum = 0;
int count =5;
sum=grade1+grade2+grade3+grade4+grade5;
/*A	: 90 – 100
B	: 80 – 89
C	: 70 – 79
D	: 60 – 69
F	: 0 – 59
*/
System.out.println("the sum of the given grades are " +sum);
// Find average
double average = sum / count;

// print the result
System.out.println("the average of the given grades are" +average);
in1.close();
in2.close();
in3.close();
in4.close();
in5.close();







	}

}
