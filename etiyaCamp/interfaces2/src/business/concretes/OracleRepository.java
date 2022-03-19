package business.concretes;

import business.abstracts.CrudRepository;

public class OracleRepository implements CrudRepository{

	@Override
	public void add() {
		System.out.println("Oracle'a Eklendi");
		
	}

	@Override
	public void list() {
		System.out.println("Oracle'dan Listelendi");

		
	}

	@Override
	public void update() {
		System.out.println("Oracle'da  Güncellendi");

		
	}

	@Override
	public void remove() {
		System.out.println("Oracle'dan Silindi");

		
	}

}
