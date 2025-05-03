package week1.day2;

public class Assignment_Palindrome {
	
	String palindrome(String var) {
		String res= "";
		for (int i=4;i>=0; i--) {
			res = res + var.charAt(i);
		}
		return(res);
	}

	public static void main(String[] args) {
		Assignment_Palindrome T1 = new Assignment_Palindrome();
		String var = "madam";
		String r1 = T1.palindrome(var);
		System.out.println(r1);
		if (var.equals(r1)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		}

		}
	}

