package business.concretes;

import entities.concretes.Customer;

public class IndividualCustomer extends Customer{
	
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	
	public IndividualCustomer() {
		super();
	}
		
	
	public IndividualCustomer(int id, String customerNumber,String firstName, String lastName, String nationalIdentity) {
		super(id,customerNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	
	
	
	
	
	// buradaki super ile customerdaki constructoru çaðýrýp setleri alabiliyoruz.
		
		//ortak olanlarý super ile getirmiþ oluruz.
	

	
	//super base kýsýmý baz alýr her zaman.
	// yukarýda base classýmýz customer sonra ise extends ediyoruz customerý
	//biz customerdaki constructordaki setleri çaðýrmak için ise super içine customer içindeki parametreleri yazýyoruz.
	// böylece oradaki setleri bize getirmiþ oluyor.

}
