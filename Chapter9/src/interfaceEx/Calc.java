package interfaceEx;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("Implement integer calculator");
//		myMethod(); // Java 9부터 지원 
		
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
//		myStaticMethod(); // Java 9부터 지원 
		return total;
	}

/*	Java 9부터 지원 
	private void myMethod() { // Java 9부터 지원 
		System.out.println("private method");
	}
	
	private static void myStaticMethod() { // Java 9부터 지원 
		System.out.println("private static method");
	}
*/
}
