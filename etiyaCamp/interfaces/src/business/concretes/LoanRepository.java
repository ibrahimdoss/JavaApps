package business.concretes;

import business.abstracts.CrudRepository;

public class LoanRepository implements CrudRepository {

	@Override
	public void add() {
		//kredi ekleme kodlarý
		System.out.println("Kredi Eklendi");
	}

	@Override
	public void list() {
		//kredi listeleme kodlarý

		
	}

	@Override
	public void update() {
		//kredi güncelleme kodlarý

		
	}

	@Override
	public void remove() {
		//kredi silme kodlarý

		
	}

}
