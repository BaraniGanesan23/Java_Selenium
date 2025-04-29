package week1.day2;

public class Conditional_statements {

	public static void main(String[] args) {
		//if
		int marks = 10;
		if (marks<40) {
			System.out.println("Fail");
		}
		
		//if-else
		int marks1 = 20;
		if (marks1>40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//nested if-else
		int marks2 = 66;
		if (marks2>=90) {
			System.out.println("Distinction");
		}
		else if (marks2>=80) {
			System.out.println("grade A");
		}
		else if (marks2>=50) {
			System.out.println("grade B");
		}
		else
			System.out.println("Fail");
			

	}

}
