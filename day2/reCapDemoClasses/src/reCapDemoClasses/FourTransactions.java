package reCapDemoClasses;

public class FourTransactions {
	
	public int Addition(int num1, int num2) {
		return num1+ num2;
		
	}
	public int substraction(int num1, int num2) {
		return num1 - num2;
	}

	public int Multiplication(int num1, int num2) {
		return num1 * num2;
	}	
	
	public int Division(int num1, int num2) {
		
		if(num2 != 0) {
			return num1 / num2;

		}
		return 0;
	}
}
