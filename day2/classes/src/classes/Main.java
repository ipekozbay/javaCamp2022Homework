package classes;

public class Main {

	public static void main(String[] args) {

		// referance type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		int num1 = 10;
		int num2 = 20;
		
		num2=num1;
		num1=30;
		System.out.print(num2);
	}

}