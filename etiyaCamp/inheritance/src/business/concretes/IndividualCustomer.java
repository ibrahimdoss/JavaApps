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
	
	
	
	
	
	
	
	// buradaki super ile customerdaki constructoru �a��r�p setleri alabiliyoruz.
		
		//ortak olanlar� super ile getirmi� oluruz.
	

	
	//super base k�s�m� baz al�r her zaman.
	// yukar�da base class�m�z customer sonra ise extends ediyoruz customer�
	//biz customerdaki constructordaki setleri �a��rmak i�in ise super i�ine customer i�indeki parametreleri yaz�yoruz.
	// b�ylece oradaki setleri bize getirmi� oluyor.

}
