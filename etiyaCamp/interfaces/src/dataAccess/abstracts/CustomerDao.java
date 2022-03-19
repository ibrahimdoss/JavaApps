package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class CustomerDao implements CrudRepository{
	
	public void add() {
		//Müþteri eklendi kodlarý
		System.out.println("Müþteri eklendi");
		
	}
	
	public void list() {
		//Müþteri listeleme kodlarý
		System.out.println("Müþteri Listelendi");
	}
	
	public void update() {
		//Müþteri güncelleme kodlarý
		System.out.println("Müþteri güncellendi");
	}
	
	public void remove() {
		//Müþteri silme kodlarý
		System.out.println("Müþteri silindi");
	}
}
