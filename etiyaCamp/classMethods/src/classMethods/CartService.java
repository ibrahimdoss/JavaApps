package classMethods;

public class CartService {
	//String[] cart bunu burada tan�mlamam�z�n sebebi di�er methodlar�n da i�inde kullanmak i�in.
	//method i�inde yazd���m�z method i�inde kullan�l�r o y�zden di�er methodlarda olmas�n� istedi�imiz �eyleri
	// method d���nda yazar�z.
	String[] cart ;
	//Constructor method
	public CartService() {
		cart= new String[] {"","",""};
	}
	
	public void addToCart(String productName) {
		cart[0]= productName;
	}
	
	public void removeFromCart(String productName) {
		System.out.println("Sepetten ��kar�ld� : " + productName);
	}
	
	public void listCart() {
		System.out.println("Sepet Listelendi : ");
	}
}

//yap�c� method ilk �al��t���nda sistemin otomatik olarak yap�lmas�n� isted�imiz i�lemleri yap�c� method i�inde yapar�z.
//yap�c� method ilk �al��mas�n� istedi�imiz i�lemleri yapar.