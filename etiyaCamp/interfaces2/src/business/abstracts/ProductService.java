package business.abstracts;

public class ProductService {
	//5 ile 10.sat�r koda kadarki k�s�m
	//Dependency Injection denir.
	private CrudRepository crudRepository;
	private Logger logger;
	
	public ProductService(CrudRepository crudRepository, Logger logger) {
		this.crudRepository=crudRepository;
		this.logger=logger;
	}
	public void add() {
		//i� kurallar� kodlan�r.
		//�rne�in bu �r�n sisteme eklenebilir bir �r�n m� 
		//�rne�in daha �nce bu �r�n eklenmi� mi 
		//�rne�in �r�n�n bilgileri do�ru mu 
		
		//t�m kurallardan ge�iyorsa veri taban�na eklenir.
		this.logger.log(" log eklendi");
		crudRepository.add();
	}
	
	public void list() {
		//i� kurallar� kodlan�r.
		crudRepository.list();
		this.logger.log(" log listelendi");

	}
}
