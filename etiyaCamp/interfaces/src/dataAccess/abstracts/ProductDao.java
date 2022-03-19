package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class ProductDao implements CrudRepository{

	public void add() {
		//�r�n eklendi kodlar�
		System.out.println("�r�n eklendi");
		
	}
	
	public void list() {
		//�r�n listeleme kodlar�
		System.out.println("�r�n Listelendi");
	}
	
	public void update() {
		//�r�n g�ncelleme kodlar�
		System.out.println("�r�n g�ncellendi");
	}
	
	public void remove() {
		//�r�n silme kodlar�
		System.out.println("�r�n silindi");
	}
}

//CRUD - create,read,update,delete