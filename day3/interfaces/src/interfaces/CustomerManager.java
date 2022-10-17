package interfaces;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal=customerDal;
		
	}
	public void add() {
		//work's codes
		customerDal.add();
	}

}
