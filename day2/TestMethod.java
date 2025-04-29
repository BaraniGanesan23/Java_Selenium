package week1.day2;

public class TestMethod {
	//access modi //returntype// methodname //input parameters
	public void add() {
		int a = 10;
		int b = 20;
		int res = a+b;
		System.out.println(res);
	}
	// all the primitive & non primitive data type can be used as return types- when you want to return
	//void returns nothing to action
	// n number of inputs can be given with different type(int a, int b, float c)
	//return type + method name
	public void addnum(int a, int b, float c) {
		System.out.println(a+b+c);
	}
	//return type + method name
	private int numofBicycles() {
		return 4;		
	}
	
	String bicycleData(String name, String colour) {
		return(name + " " + colour);
	}
	
	public static void main(String[] args) {
		//classname objname = new constructorname()
		TestMethod T1= new TestMethod();
		T1.add();
		TestMethod T2 = new TestMethod();
		T2.addnum(5, 0, 1.1f);
		System.out.println(T2.numofBicycles());
		int res = T2.numofBicycles();
		System.out.println(res);
//		T2.bicycleData("Hero", "Red");
		System.out.println(T2.bicycleData("Hero", "Red"));
		}

	}
