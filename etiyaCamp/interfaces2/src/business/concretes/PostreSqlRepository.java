package business.concretes;

import business.abstracts.CrudRepository;

public class PostreSqlRepository implements CrudRepository {

	@Override
	public void add() {
		System.out.println("Postgre eklendi");
		
	}

	@Override
	public void list() {
		System.out.println("Postgre listelendi");
		
	}

	@Override
	public void update() {
		System.out.println("Postgre güncellendi");
		
	}

	@Override
	public void remove() {
		System.out.println("Postgre silindi");
		
	}

}
