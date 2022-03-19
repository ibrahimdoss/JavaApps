package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class EmployeeDao implements CrudRepository{
	public void add() {
		//Personel eklendi kodlarý
		System.out.println("Personel eklendi");
		
	}
	
	public void list() {
		//Personel listeleme kodlarý
		System.out.println("Personel Listelendi");
	}
	
	public void update() {
		//Personel güncelleme kodlarý
		System.out.println("Personel güncellendi");
	}
	
	public void remove() {
		//Personel silme kodlarý
		System.out.println("Personel silindi");
	}
}
