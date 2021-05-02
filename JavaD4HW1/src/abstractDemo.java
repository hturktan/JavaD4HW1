
public class abstractDemo {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManagere = new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
