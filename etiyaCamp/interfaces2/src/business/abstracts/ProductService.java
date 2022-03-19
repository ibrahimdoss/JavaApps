package business.abstracts;

public class ProductService {
	//5 ile 10.satýr koda kadarki kýsým
	//Dependency Injection denir.
	private CrudRepository crudRepository;
	private Logger logger;
	
	public ProductService(CrudRepository crudRepository, Logger logger) {
		this.crudRepository=crudRepository;
		this.logger=logger;
	}
	public void add() {
		//iþ kurallarý kodlanýr.
		//örneðin bu ürün sisteme eklenebilir bir ürün mü 
		//örneðin daha önce bu ürün eklenmiþ mi 
		//örneðin ürünün bilgileri doðru mu 
		
		//tüm kurallardan geçiyorsa veri tabanýna eklenir.
		this.logger.log(" log eklendi");
		crudRepository.add();
	}
	
	public void list() {
		//iþ kurallarý kodlanýr.
		crudRepository.list();
		this.logger.log(" log listelendi");

	}
}
