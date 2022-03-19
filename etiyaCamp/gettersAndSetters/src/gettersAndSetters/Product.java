package gettersAndSetters;

// kod yaz�m s�ralamam�zda
// 1- fields
//2- constructors
//3-methods
public class Product {
	
	//fields
	private String name;
	private double unitPrice;
	private double discountRate;
	private double discountedPrice;
	
	public Product() {
		//parametresiz yap�c� method.
	}
	// constructors
	public Product(String name, double unitPrice, double discountRate, double discountedPrice) {
		super();
		this.name = name;// 
		//this demek mevcut class demek yani bizim product class��m�z
		//yukar�daki this.name class i�indeki fieldslere ula�mak i�in kullan�r�z.
		//=name olan ise yap�c� method i�indeki parametreyi al�r.
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.discountedPrice = discountedPrice;
		
		
	}
	
	//methods
	//read
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountedPrice() {
		return unitPrice -(unitPrice*discountRate/100);
	}
	
}
