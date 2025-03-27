package JavaD1;
import java.util.Scanner;

public class Day2Assign_EmployeeSalary {
	int empBSalary, empBOA, empBonus ;
	double pfAmount, empYearlyGross, empYearlyTax, empMonthlyTax, empMonthlyTakeHomeSalary, empMonthlyGross;
	Scanner sc = new Scanner(System.in);

	public double pfContribution(int empBSalary) {
		pfAmount = empBSalary*0.12d;
		return pfAmount;
	}
	
	public double monthlyGross () {
		empMonthlyGross = ((empBSalary + empBOA +empBonus ) - pfAmount);
		return empMonthlyGross;
	}
	
	public double yearlyGross () {
		empYearlyGross = monthlyGross() *12 ;
		return empYearlyGross;
	}
	
	public double yearlyTax() {
		if(empYearlyGross<=250000) {
			empYearlyTax = 0;}
		
		else if((empYearlyGross > 250000 ) && (empYearlyGross <=500000)){
			empYearlyTax = empYearlyGross * 0.05 ;
			}
		
		else if((empYearlyGross > 500000) && (empYearlyGross <=750000)){
			empYearlyTax = empYearlyGross * 0.10 ;
			}
		
		else if((empYearlyGross > 750000) && (empYearlyGross <=1000000)){
			empYearlyTax = empYearlyGross * 0.15 ;
			}
		
		else if((empYearlyGross > 1000000) && (empYearlyGross <=1250000)){
			empYearlyTax = empYearlyGross * 0.20 ;
			}
		
		else if((empYearlyGross > 1250000) && (empYearlyGross <=1500000)){
			empYearlyTax = empYearlyGross * 0.25 ;
			}
		
		else{
			empYearlyTax = empYearlyGross * 0.30 ;
			}
		
		return (empYearlyTax);
	}
	
	public double monthlyTax() {
		empMonthlyTax = (empYearlyTax/12);
		return(empMonthlyTax);
	}
	
	public void monthlyTakeHomeSalary() {
		empMonthlyTakeHomeSalary = (monthlyGross() - empMonthlyTax);
	}
	
	public static void main(String args[]) {

		Day2Assign_EmployeeSalary emp = new Day2Assign_EmployeeSalary();
		System.out.println("Enter your Basic Salary");
		emp.empBSalary = emp.sc.nextInt();
		
		emp.pfContribution(emp.empBSalary);
		System.out.println("Enter your Basket Of Allowance");
		
		emp.empBOA = emp.sc.nextInt();
		System.out.println("Enter your Bonus Amount");
		
		emp.empBonus = emp.sc.nextInt();
		
		System.out.println("your empBSalary is " +emp.empBSalary);
		System.out.println("your empBOA is " +emp.empBOA);
		System.out.println("your empBonus " +emp.empBonus);
		System.out.println("your pfAmount is " +emp.pfAmount);
		
		emp.monthlyGross();
		System.out.println("your monthly gross salary is " +emp.empMonthlyGross);

		emp.yearlyGross();
		System.out.println("your yearly gross salary is " +emp.empYearlyGross);

		emp.yearlyTax();
		System.out.println("your yearly tax is " +emp.empYearlyTax);
		
		emp.monthlyTax();
		System.out.println("your monthly tax is " +emp.empMonthlyTax);
		
		emp.monthlyTakeHomeSalary();
		System.out.println("your monthly take home salary is " +emp.empMonthlyTakeHomeSalary);

		emp.sc.close();
	}

}

/*
 * methods: 
 * pfContribution-basic*0.12 -Done
 * monthlyGross -(basic+boa+bonus)-PF -Done
 * yearly gross -monthly gross * 12 - Done
 * yearly tax -yearly gross * tax rate (if else)- Done
 * monthly tax - yearly tax/12 -
 * TakeHomeSalary-monthly gross-monthly tax
 * 
 * Main method- done
 * BasicSalary	BOA		Bonus	PF	 MonthGross	YearGross	YearlyTax	MonthlyTax	TakeHomeSalary
		15000	17000	4000	1800	34200	410400		20520		1710		32490
		7000	5000	2000	840		13160	157920		0			0			13160
		10000	7000	2500	1200	18300	219600		0			0			18300
		12000	9000	3000	1440	22560	270720		13536		1128		21432
		15000	10000	3500	1800	26700	320400		16020		1335		25365
		50000	30000	10000	6000	84000	1008000		201600		16800		67200

 */
