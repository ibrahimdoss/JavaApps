package classMethods;

public class CartService {
	//String[] cart bunu burada tanýmlamamýzýn sebebi diðer methodlarýn da içinde kullanmak için.
	//method içinde yazdýðýmýz method içinde kullanýlýr o yüzden diðer methodlarda olmasýný istediðimiz þeyleri
	// method dýþýnda yazarýz.
	String[] cart ;
	//Constructor method
	public CartService() {
		cart= new String[] {"","",""};
	}
	
	public void addToCart(String productName) {
		cart[0]= productName;
	}
	
	public void removeFromCart(String productName) {
		System.out.println("Sepetten Çýkarýldý : " + productName);
	}
	
	public void listCart() {
		System.out.println("Sepet Listelendi : ");
	}
}

//yapýcý method ilk çalýþtýðýnda sistemin otomatik olarak yapýlmasýný istedðimiz iþlemleri yapýcý method içinde yaparýz.
//yapýcý method ilk çalýþmasýný istediðimiz iþlemleri yapar.