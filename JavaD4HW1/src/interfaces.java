
public class interfaces {
	
	// interfaces ler de newlenmezler. imza ta��rlar. �mplementasyon olur.
	// implementte, bir class birden fazla class'� implement edebilir.
	
	public static void main(String[] args) {
		CustomerManager2 customerManager2 = new CustomerManager2(new MySqlCustomerDal());
		// customerManager2.customerDal = new SqlCustomerDal();
		customerManager2.add();
	}

}
