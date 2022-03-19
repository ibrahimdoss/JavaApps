package dataAccess.abstracts;

import business.abstracts.CrudRepository;

public class ProductDao implements CrudRepository{

	public void add() {
		//Ürün eklendi kodlarý
		System.out.println("Ürün eklendi");
		
	}
	
	public void list() {
		//Ürün listeleme kodlarý
		System.out.println("Ürün Listelendi");
	}
	
	public void update() {
		//Ürün güncelleme kodlarý
		System.out.println("Ürün güncellendi");
	}
	
	public void remove() {
		//Ürün silme kodlarý
		System.out.println("Ürün silindi");
	}
}

//CRUD - create,read,update,delete