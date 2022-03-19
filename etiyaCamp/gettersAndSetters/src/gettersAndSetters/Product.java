package gettersAndSetters;

// kod yazým sýralamamýzda
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
		//parametresiz yapýcý method.
	}
	// constructors
	public Product(String name, double unitPrice, double discountRate, double discountedPrice) {
		super();
		this.name = name;// 
		//this demek mevcut class demek yani bizim product classýýmýz
		//yukarýdaki this.name class içindeki fieldslere ulaþmak için kullanýrýz.
		//=name olan ise yapýcý method içindeki parametreyi alýr.
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
