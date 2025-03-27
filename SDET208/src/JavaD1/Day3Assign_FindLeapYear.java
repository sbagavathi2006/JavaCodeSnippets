package JavaD1;

import java.util.ArrayList;

public class Day3Assign_FindLeapYear {
//	Please write a java program to print the leap years 
//	between 2000 and 2100 - Hint: for loop and multiple if-else  
	
	public boolean isLeapYear(int year) {
		
		if(year%4==0)		
		return true;
		else return false;
	}
	
	public static void main(String args[]) {
		int startYear =2000;
		int endYear = 2100;
	    ArrayList<Integer> arrLeapYears = new ArrayList<>();
	    Day3Assign_FindLeapYear myObj = new Day3Assign_FindLeapYear();
	    
	    for(int i=startYear; i <= endYear; i++ ) {
	    	if(myObj.isLeapYear(i)) {
	    		arrLeapYears.add(i);
	    	}
	    	    	
	    }
	    
		System.out.println("We have "+ arrLeapYears.size()
		+ " leap years from "+ startYear + " to "+ endYear + " which are " + arrLeapYears);
	    
	}

}
