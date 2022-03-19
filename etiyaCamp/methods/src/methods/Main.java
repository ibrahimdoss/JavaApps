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
		System.out.println("Aylýk ödeme: " + payment);
		
		
	}

}
// eðer methodumuzu baþka yerde kullanacaksak ona void yerine int string vs veririz ve return diyip deðiþken adýmýzý yazarýz.
// return etmek bir nesneyi çaðýrdýðýmýzda o nesne sanki bir deðiþkene atanabilirmiþ gibi bir iþlev saðlar.
//example: bir hesaplama yaptýk diyelim onu baþka yerde kullanacaksak return kullanabiliriz.
// sadece iþlem yapacaksak void ama hem iþlem hem de onu baþka yerde return kullanýrýz.