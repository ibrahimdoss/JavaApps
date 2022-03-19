package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class CustomerDao implements CrudRepository{
	
	public void add() {
		//M��teri eklendi kodlar�
		System.out.println("M��teri eklendi");
		
	}
	
	public void list() {
		//M��teri listeleme kodlar�
		System.out.println("M��teri Listelendi");
	}
	
	public void update() {
		//M��teri g�ncelleme kodlar�
		System.out.println("M��teri g�ncellendi");
	}
	
	public void remove() {
		//M��teri silme kodlar�
		System.out.println("M��teri silindi");
	}
}
