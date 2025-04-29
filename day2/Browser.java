package week1.day2;

public class Browser {
	
	public String launchBrowser(String a) {
		return("Browser launched successfully: " +a);
	}
	protected void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser B1 = new Browser();
		System.out.println(B1.launchBrowser("Chrome"));
		B1.loadUrl();
		
	}

}

