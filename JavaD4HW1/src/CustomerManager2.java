
public class CustomerManager2 {
	// CustomerManager2 nin customerDal'� var ve biz onun add'ini �a��raca��z. 
	private CustomerDal customerDal;
	
	public CustomerManager2(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// i� kodlar� yaz�l�r. 
		// buras� dal '� �a��r�r
		// m�steri ad� girildi mi , veriler do�ru mu? onlara bak�l�r. 
		
		customerDal.add();
	}
}
