package JavaD1;

//Scanner class used to get user input. it is available in java.util package.
import java.util.Scanner;

public class StudentMarksUserInputScanner {

	float tMarks;
	String studName;
// Extra: Explore scanner option in java to give data input via console
//	Create a scanner object.
	Scanner myObj = new Scanner(System.in);// System.in is an system input stream in java.


	/*
	 * Create two methods one for calculating total marks, print it and another for
	 * calculating average, print it.”
	 */

	public void totalMarks() {
		//Read data from User Input and store in variables
		System.out.println("Enter Student Name");
		studName = myObj.nextLine();
		System.out.println("Enter Mathematics mark");
		float mathematics = myObj.nextFloat();
		System.out.println("Enter Science mark");
		float science = myObj.nextFloat();
		System.out.println("Enter Social mark");
		float social = myObj.nextFloat();
		System.out.println("Enter ELA mark");
		float ela = myObj.nextFloat();

		tMarks = (mathematics + science + social + ela);
		System.out.println(studName+"'s Total marks: " + tMarks);
	}

	public void avgMarks(float tMarks, String name) {
		this.tMarks = tMarks;
		float avgMarks = tMarks / 4;
		System.out.println(name+ "'s Average mark: " + avgMarks);
	}

	/*
	 * Create four objects for four different students, assign marks of each student
	 * (in main method) and print calculated sum and average
	 */
	public static void main(String args[]) {

		StudentMarksUserInputScanner stud = new StudentMarksUserInputScanner();
		stud.totalMarks();
		stud.avgMarks(stud.tMarks, stud.studName);
		stud.myObj.close();
		
	}

}
