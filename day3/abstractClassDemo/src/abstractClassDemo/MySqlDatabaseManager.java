package abstractClassDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{

	@Override
	public void getData() {
		System.out.println("mysql");
	}

}
