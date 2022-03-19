package dataAccess.abstracts;

import java.util.ArrayList;

import business.concretes.CorporateCustomer;

public class CorporateCustomerDao {
ArrayList<CorporateCustomer> customers;
	
	public CorporateCustomerDao() {
		customers = new ArrayList<CorporateCustomer>();
	}
	
	public ArrayList<CorporateCustomer> getCustomers(){
		return this.customers;
	}
	
	public void add(CorporateCustomer customer) {
		this.customers.add(customer);
	}
	
	public void removeById(int id) {
		for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {

                System.out.println("Silindi " + id + ":");
                this.customers.remove(i);
            }	
		}
	}
	
	public void removeByTaxNumber(String taxNumber) {
		for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getTaxNumber() == taxNumber) {

                System.out.println("Silindi = " + taxNumber );
                this.customers.remove(i);
            }	
		}
	}
	
	//removeByTaxNumber("1234567" ,remove(CorporateCustomer))
	
	public void removeByTaxNumber2(String taxNumber , CorporateCustomer customer) {
		
		for (CorporateCustomer corporateCustomer : customers) {
			if(corporateCustomer.getTaxNumber().equals(taxNumber) && corporateCustomer.getClass() == customer.getClass()) {
				this.customers.remove(customer);
				return;
			}
		}	
	}
	
	public void remove(CorporateCustomer customer) {
		
		for (CorporateCustomer corporateCustomer : customers) {
			if(corporateCustomer.getClass() == customer.getClass()) {
				this.customers.remove(customer);
				return;
		}		
	}
}
}
