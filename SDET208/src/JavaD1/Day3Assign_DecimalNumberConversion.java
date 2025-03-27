package JavaD1;

import java.util.Scanner;

public class Day3Assign_DecimalNumberConversion {
//	Please write a java program to print the binary, octal, hexadecimal form of a given 
//	decimal number (example : for the input 10, print 1010(binary), 12 (octal), A (hexa))
	int n;
	Scanner sc= new Scanner(System.in);

	public String decimal2Binary(int n) {
	 if (n==0) {
		 return "0000";
	 }
		return (decimal2Binary(n/2)+(n%2));
	}
	
	public String decimal2Octal(int n) {
		 if (n==0) {
			 return "0";
		 }
			return (decimal2Octal(n/8)+(n%8));
		}
	
//	public String decimal2Hexadecimal(int n) {
//		 if (n==0) { return "0";
//		 }else if ((n%16)==10) {return "A";
//		 }else if ((n%16)==11) {return "B";
//		 }else if ((n%16)==12) {return "C";
//		 }else if ((n%16)==13) {return "D";
//		 }else if ((n%16)==14) {return "E";
//		 }else if ((n%16)==15) {return "F";
//		 }else {return (decimal2Hexadecimal(n/16)+(n%16));}
//		}
//	
	
	public String decimal2Hexadecimal(int n) {
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexValue ="";
		while(n>0) {
			int remainder =(n%16);
			hexValue = hex[remainder]+hexValue;
			n/=16;
		}
			return hexValue;
		}
	
	public static void main(String args[]) {
		Day3Assign_DecimalNumberConversion myObj = new Day3Assign_DecimalNumberConversion();
		System.out.println("Enter a number for conversion");
		myObj.n = myObj.sc.nextInt();
		System.out.println("Binary value of the number " +myObj.n+ " is "+ myObj.decimal2Binary(myObj.n));
		System.out.println("Octal value of the number " +myObj.n+ " is "+ myObj.decimal2Octal(myObj.n));
		System.out.println("HexaDecimal value of the number " +myObj.n+ " is "+ myObj.decimal2Hexadecimal(myObj.n));
		myObj.sc.close();
	}
//
//	Decimal(Input) Binary    		Octal     HexaDecimal
//	31				11111			37			1F
//	25			   11001	 		31			19
//	259			   100000011 		403			103
//	6857		   1101011001001	015311		1AC9	
// 19857		 100110110010001	46621		4D91	
// 8754 		 10001000110010		021062		2232
}
