package business.concretes;

import business.abstracts.CrudRepository;

public class LoanRepository implements CrudRepository {

	@Override
	public void add() {
		//kredi ekleme kodlar�
		System.out.println("Kredi Eklendi");
	}

	@Override
	public void list() {
		//kredi listeleme kodlar�

		
	}

	@Override
	public void update() {
		//kredi g�ncelleme kodlar�

		
	}

	@Override
	public void remove() {
		//kredi silme kodlar�

		
	}

}
