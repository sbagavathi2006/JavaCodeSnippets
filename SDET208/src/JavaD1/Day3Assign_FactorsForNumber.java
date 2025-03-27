package JavaD1;

import java.util.ArrayList;

public class Day3Assign_FactorsForNumber {
	/*
	 * Please write a java program to print the factors and total number of factors
	 * of the given number (example: for the input 60, we have 12 factors which are
	 * 1 2 3 4 5 6 10 12 15 20 30 60)
	 */
    ArrayList<Integer> numberFactors = new ArrayList<>();

	public void findFactors(int num) {

		for(int i=1; i <= num; i++) {
			if(num%i==0) {
				numberFactors.add(i);
			}
		} 
	}
	
	public static void main(String args[]) {
		int input = 60;
		Day3Assign_FactorsForNumber myObj = new Day3Assign_FactorsForNumber();
		myObj.findFactors(input);
		System.out.println("We have "+ myObj.numberFactors.size() + " factors which are " + myObj.numberFactors);
	}
}
