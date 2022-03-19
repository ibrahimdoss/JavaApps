package dataAccess.abstracts;

import java.util.ArrayList;

import business.concretes.IndividualCustomer;

//Dao - Data Access Object
public class IndividualCustomerDao {
	
	ArrayList<IndividualCustomer> customers;
	
	public IndividualCustomerDao() {
		// bunlar gerçek sistemde DB'den gelir.
		customers = new ArrayList<IndividualCustomer>();
	}

	public ArrayList<IndividualCustomer> getCustomers(){
		return this.customers;
	}
	
	public void add(IndividualCustomer customer) {
		this.customers.add(customer);
	}
}
