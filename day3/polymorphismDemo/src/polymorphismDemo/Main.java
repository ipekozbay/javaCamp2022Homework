package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger  emailLogger = new EmailLogger();
		//emailLogger.Log("logged-email");
		
		//BaseLogger [] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		//for(BaseLogger logger:loggers) {
		//	logger.Log("log message");
		//}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
