package methodExample;

public class CustomerService {
	
	
	
	public static void addCustomer(String customerName) {
		System.out.println("M��teri Eklendi: " + customerName);
	}
	
	public static void removeCustomer(String customerName) {
		System.out.println("M��teri Silindi: " + customerName);
	}
	
	
	public static void addCustomer(String customerName, String lastName) {
		System.out.println("M��teri Ad� ve Soyad� Eklendi");
	}
	
}
