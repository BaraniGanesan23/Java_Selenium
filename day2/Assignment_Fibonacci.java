package week1.day2;

public class Assignment_Fibonacci {
	
	void fibo(int n) {
		int a =0, b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int z = a + b; 
			b =a;
			a = z; 
		
	}
	}

	public static void main(String[] args) {
		Assignment_Fibonacci T1 = new Assignment_Fibonacci();
		T1.fibo(10);
		}
	}

