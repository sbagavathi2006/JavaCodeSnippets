package JavaD1;

import java.util.Scanner;

public class Day3Assign_FindDayOfWeek {
	/*
	 * /Please write a java program to print the day of the week when number is
	 * given ligbhy(example: 1 means Sunday should be printed) - Hint: Switch case
	 */
	
	public void findDay(int i) {
		int day = i;
		switch (day) {
		  case 1:
		    System.out.println("Sunday");
		    break;
		  case 2:
		    System.out.println("Monday");
		    break;
		  case 3:
		    System.out.println("Tuesday");
		    break;
		  case 4:
		    System.out.println("Wednesday");
		    break;
		  case 5:
		    System.out.println("Thursday");
		    break;
		  case 6:
		    System.out.println("Friday");
		    break;
		  case 7:
		    System.out.println("Saturday");
		    break;
		}
		
	}
	
	public static void main (String args[]) {
		Day3Assign_FindDayOfWeek myObj = new Day3Assign_FindDayOfWeek();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 to 7: ");
		int number = sc.nextInt();
		if(number <=7 && number!=0)
		{myObj.findDay(number);}
		else { 		
			System.out.println("Wrong Number. Please enter number between 1 to 7: ");
			int number1 = sc.nextInt();
			if(number1 <=7 && number1!=0)
			{myObj.findDay(number1);}
			else { System.out.println("Wrong Number.Please try later.");}
		sc.close();
	}
	}

}
