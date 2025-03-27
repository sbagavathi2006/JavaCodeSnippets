package JavaD1;


public class StudentMarks {
	
//	Please write a java program to calculate sum & average of given 4 marks via constructor, 
//	if three or two marks only passed from main method, then keep the missing value(s) as 35) - 
//	Hint - multiple constructor 
	
	float mathematics;
	float science;
	float social;
	float ela;
	float tMarks;
	
	StudentMarks(float mathematicsNew, float scienceNew, float socialNew, float ela){
		mathematics = mathematicsNew;
		science = scienceNew;
		social = socialNew;
		this.ela = ela;
		
		System.out.println("Used 4 Parameter Constructor");

		System.out.println("Math " + mathematics+"\n"+"Science " + science+"\nSocial "+social+
				"\nELA "+ela);

	}
	
	StudentMarks(float mathematicsNew, float scienceNew, float socialNew){
		mathematics = mathematicsNew;
		science = scienceNew;
		social = socialNew;
		this.ela = 35;
		
		System.out.println("Used 3 Parameter Constructor");
		System.out.println("Math " + mathematics+"\n"+"Science " + science+"\nSocial "+social+
				"\nELA "+ela);

	}
	
	StudentMarks(float mathematicsNew, float scienceNew){
		mathematics = mathematicsNew;
		science = scienceNew;
		social = 35;
		this.ela = 35;
		
		System.out.println("Used 2 Parameter Constructor");
		System.out.println("Math " + mathematics+"\n"+"Science " + science+"\nSocial "+social+
				"\nELA "+ela);
	}
	
	StudentMarks(float mathematicsNew){
		mathematics = mathematicsNew;
		science = 35;
		social = 35;
		this.ela = 35;	
		
		System.out.println("Used 1 Parameter Constructor");
		System.out.println("Math " + mathematics+"\n"+"Science " + science+"\nSocial "+social+
				"\nELA "+ela);
	}
	
	StudentMarks(){
		mathematics = 35;
		science = 35;
		social = 35;
		this.ela = 35;		
		
		System.out.println("Used 0 Parameter Constructor");
		System.out.println("Math " + mathematics+"\n"+"Science " + science+"\nSocial "+social+
				"\nELA "+ela);
	}
	
	public void totalMarks() {
		tMarks = (mathematics + science + social + ela);
		System.out.println("Total marks" + tMarks);
	}

	public void avgMarks(float tMarks) {
		this.tMarks = tMarks;
		float avgMarks = tMarks / 4;
		System.out.println("Average mark is " + avgMarks);
	}

	public static void main(String args[]) {

		StudentMarks stud1 = new StudentMarks(57.6f,75.6f,86.4f);
		stud1.totalMarks(); 
		stud1.avgMarks(stud1.tMarks);
		System.out.println("\n");

		
		StudentMarks stud2 = new StudentMarks();
		stud2.totalMarks(); 
		stud2.avgMarks(stud2.tMarks);
		System.out.println("\n");

		
		StudentMarks stud3 = new StudentMarks(78,85,69,74);
		stud3.totalMarks(); 
		stud3.avgMarks(stud3.tMarks);
		System.out.println("\n");

		
		StudentMarks stud4 = new StudentMarks(86.5f,98);
		stud4.totalMarks(); 
		stud4.avgMarks(stud4.tMarks);
		System.out.println("\n");

		
		StudentMarks stud5 = new StudentMarks(45);
		stud5.totalMarks(); 
		stud5.avgMarks(stud5.tMarks);
		System.out.println("\n");



	}

}
