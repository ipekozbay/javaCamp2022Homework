package interfaces;

public class Main {

	public static void main(String[] args) {
		//interfaceler  onu implemente eden classın referansnı tutabilir.
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
	}

}