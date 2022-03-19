package methods;

public class Main {

	public static void main(String[] args) {
		
		addToCart("Laptop");
		calculateTotal(30000,1.6,36);
		monthlyPayment(5);
	}
	
	public static void addToCart(String productname) {
		System.out.println("Sepete Eklendi: " + productname);
	}
	
	public static double calculateTotal(double creditAmount,double interestRate,int months) {
		double total=creditAmount*interestRate;
		return total;
	}
	
	public static void monthlyPayment(int months) {
		
		double total= calculateTotal(30000,1.6,36);
		
		double payment= total/months;
		System.out.println("Ayl�k �deme: " + payment);
		
		
	}

}
// e�er methodumuzu ba�ka yerde kullanacaksak ona void yerine int string vs veririz ve return diyip de�i�ken ad�m�z� yazar�z.
// return etmek bir nesneyi �a��rd���m�zda o nesne sanki bir de�i�kene atanabilirmi� gibi bir i�lev sa�lar.
//example: bir hesaplama yapt�k diyelim onu ba�ka yerde kullanacaksak return kullanabiliriz.
// sadece i�lem yapacaksak void ama hem i�lem hem de onu ba�ka yerde return kullan�r�z.