package week1.day2;

public class Assignment_IsPrime {
	
	boolean is_prime (int n) {
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 6;
		if (n<=1) {
			System.out.println("negative number or 1 is not prime");
		}
		else {
			Assignment_IsPrime T1 = new Assignment_IsPrime();
			boolean res = T1.is_prime(n);
			if (res==true) {
				System.out.println("number is prime: "+n);
			}
			else {
				System.out.println("number is not prime: "+n);
			}

		}		
	}
}
