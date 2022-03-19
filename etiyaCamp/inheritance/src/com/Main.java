package com;

import java.util.ArrayList;

import business.concretes.CorporateCustomer;
import business.concretes.IndividualCustomer;
import dataAccess.abstracts.CorporateCustomerDao;
import dataAccess.abstracts.IndividualCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		

		//******* Base sýnýflar,super sýnýflar yani customer sýnýfýmýz.
		//******* onu extend eden yani(inherit eden) sýnýflarýn referansýný tutabilir.
		//****** örnek aþaðýdaki gibi Indv ve corpo sýnýflarý customerý extend ettiði için customer onlarý referans olarak tutabilir.
		
		/*
		 * Customer furkan = new IndividualCustomer(6,"8643","furkan","ünlü","3352332");
		 * Customer twitter = new CorporateCustomer(8,"8643","twt","3352332");
		 */
		
		

		IndividualCustomer individualCustomer = new IndividualCustomer(2,"54321","Berkay","Eraydin","12321412412");
		IndividualCustomer individualCustomer2 = new IndividualCustomer(4,"98756","Engin","Demirog","12321412413");
		//individualCustomer.setId(2);
		//individualCustomer.setCustomerNumber("12345");
		CorporateCustomer corporateCustomer = new CorporateCustomer(3,"12345","Etiya","1234567890");
		CorporateCustomer corporateCustomer2 = new CorporateCustomer(5,"16484","Kodlama.io","5554567890");
		
		Customer furkan = new IndividualCustomer(6,"12346","Furkan","Unlu","54442356943");
		Customer twitter = new CorporateCustomer(7,"43532","Twitter","4569156785");
		
		//POLLYMORPHISM
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(individualCustomer);
		customers.add(individualCustomer2);
		customers.add(corporateCustomer);
		customers.add(corporateCustomer2);
		customers.add(furkan);
		customers.add(twitter);
		
		// REFERANCE TUTABILDIGINI GORMEK 
		
		/*for (Customer customer : customers) {
			if(customer instanceof IndividualCustomer) {
				IndividualCustomer individualCustomer3 = (IndividualCustomer)customer;
				System.out.println("Bireysel : "+individualCustomer3.getFirstName() );
			}else {
				CorporateCustomer corporateCustomer3 = (CorporateCustomer)customer;
				System.out.println("Ticari : "+ corporateCustomer3.getCampanyName() );
			}
			
		}*/
		
		IndividualCustomerDao individualCustomerDao = new IndividualCustomerDao();
 		individualCustomerDao.add(individualCustomer);
 		individualCustomerDao.add(individualCustomer2);
 		individualCustomerDao.add((IndividualCustomer)furkan);
		
 		/*for (IndividualCustomer customer : individualCustomerDao.getCustomers()) {
			System.out.println(customer.getFirstName());
		}*/
 		
 		CorporateCustomerDao corporateCustomerDao = new CorporateCustomerDao();
 		corporateCustomerDao.add(corporateCustomer);
 		corporateCustomerDao.add(corporateCustomer2);
 		corporateCustomerDao.add((CorporateCustomer)twitter);
 		
 
 		
 		System.out.println("----------Customers Listeleme-------");
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println(customer.getCompanyName());
		}
 		
 		//corporateCustomerDao.removeById(3);
 		
 		/*System.out.println("-----------------");
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println(customer.getCampanyName());
		}*/
 		
 		
 		System.out.println("----------taxNumber Ilk hali-------");
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println(customer.getTaxNumber()+"  =>  "+ customer);
		}
 		corporateCustomerDao.removeByTaxNumber("5554567890");
 		
 		System.out.println("-------taxNumber eleman silinmis hali----------");
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println(customer.getTaxNumber()+"  =>  "+ customer);
		}
 		System.out.println();
 		System.out.println("-------Custemersa ayni ozellikte twitter eklendi----------");
 				
 		Customer twitter2 = new CorporateCustomer(7,"43532","Twitter","4569156785");
 		corporateCustomerDao.add((CorporateCustomer)twitter2);
 		
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println("Sirket ismi : "+customer.getCompanyName()+ "  textNumber : "+customer.getTaxNumber()+"  =>  "+ customer);
		}
 		
 		//corporateCustomer - etiya
 		corporateCustomerDao.remove(corporateCustomer);
 		
 		//corporateCustomerDao.removeByTaxNumber2("1234567890",corporateCustomer);
 	
 		System.out.println("-------Custemersa ayni ozellikte eklenen silindi----------");
 		for (CorporateCustomer customer : corporateCustomerDao.getCustomers()) {
			System.out.println("Sirket ismi : "+customer.getCompanyName()+ "  textNumber : "+customer.getTaxNumber()+"  =>  "+ customer);
		}
 		
 		
	}

}

