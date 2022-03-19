package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class EmployeeDao implements CrudRepository{
	public void add() {
		//Personel eklendi kodlar�
		System.out.println("Personel eklendi");
		
	}
	
	public void list() {
		//Personel listeleme kodlar�
		System.out.println("Personel Listelendi");
	}
	
	public void update() {
		//Personel g�ncelleme kodlar�
		System.out.println("Personel g�ncellendi");
	}
	
	public void remove() {
		//Personel silme kodlar�
		System.out.println("Personel silindi");
	}
}
