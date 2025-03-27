package JavaD1;
import java.util.ArrayList;

public class Day3Assign_First30PrimeNos {
	/*
	 * Please write a java program to find the first 30 prime numbers. Hint : for
	 * loop and multiple if-else
	 */
	
	public boolean isPrime(int num) {
		if (num < 2) return false; //not prime

	for (int i=2; i<num; i++) {
		if(num%i==0)return false;//divide each number by i,divisible, not prime
		}
	return true;
		
	}
	
	public static void main(String args[]) {
		int count = 0;
        int number = 2;
        ArrayList<Integer> primeNosArray = new ArrayList<>();

        Day3Assign_First30PrimeNos myObj = new Day3Assign_First30PrimeNos();

        while (count < 30) { // Find first 30 prime numbers
            if (myObj.isPrime(number)) {
                primeNosArray.add(number);
                count++;
            }
            number++;
        }
        
        System.out.println("First 30 prime numbers: " + primeNosArray);
    }
	
	

}
