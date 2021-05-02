
public class CustomerManager {
	
	// base database managere her iki base 'e sahip olduğu için aşağıda kimi çağırırsak, orası işlem görür. 
	BaseDatabaseManagere databaseManagere; 
	
	public void getCustomers() {
		databaseManagere.getData();
	}
}
