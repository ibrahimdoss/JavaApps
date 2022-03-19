package business.concretes;

import business.abstracts.CrudRepository;

public class MsSqlRepository implements CrudRepository {

	@Override
	public void add() {
		System.out.println("MsSql  Eklendi");

	}

	@Override
	public void list() {
		System.out.println("MsSql listelendi");

	}

	@Override
	public void update() {
		System.out.println("MsSql güncellendi");

	}

	@Override
	public void remove() {
		System.out.println("MsSql silindi");

	}

	
	
}
