package week1.day2;

public class Assignment_Palindrome {
	
	void palindrome(String var) {
		String res= "";
		for (int i=4;i>=0; i--) {
			//System.out.println(charAt(i));
			res = res + var.charAt(i);
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Assignment_Palindrome T1 = new Assignment_Palindrome();
		T1.palindrome("madam");

		}
	}

