package JavaD1;
import java.util.Scanner;
public class Day3Assign_NthFibonacciSeriesNumber {
	
	/* Please write a java program to print the nth fibonacci series number
	 * (example:9th fibonacci series is 34) Hint : use simple if condition with
	 * recursive function call	 */
	
	public int fibonacciSeries(int n) {

		   if (n == 1|| n== 2) {
	            return 1;
	        }
	        return fibonacciSeries(n-1) + fibonacciSeries(n - 2);//method calls its own method is called Recurrance
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get that fibonacci series values :");
		int n=sc.nextInt();
		Day3Assign_NthFibonacciSeriesNumber obj = new Day3Assign_NthFibonacciSeriesNumber();
		int result = obj.fibonacciSeries(n);
		System.out.println(n + "th fibonacci series number is : " + result);
		sc.close();
	}
}

//https://en.wikipedia.org/wiki/Fibonacci_sequence
//the sequence starts with F1=F2=1, the recurrence F{n}=F{n-1}+F{n-2}} is valid for n > 2.
//F1 F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14		F15		F16		F17		F18		F19
//1	 1	2	3	5	8	13	21	34	55	89	144	233	377		610		987		1597	2584	4181