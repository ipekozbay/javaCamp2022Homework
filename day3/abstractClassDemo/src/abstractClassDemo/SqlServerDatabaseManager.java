package abstractClassDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {

	@Override
	public void getData() {
		System.out.println("sql server");
	}

}
