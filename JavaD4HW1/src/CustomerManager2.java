
public class CustomerManager2 {
	// CustomerManager2 nin customerDal'ý var ve biz onun add'ini çaðýracaðýz. 
	private CustomerDal customerDal;
	
	public CustomerManager2(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iþ kodlarý yazýlýr. 
		// burasý dal 'ý çaðýrýr
		// müsteri adý girildi mi , veriler doðru mu? onlara bakýlýr. 
		
		customerDal.add();
	}
}
