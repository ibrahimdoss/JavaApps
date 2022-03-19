package methodExample;

public class CustomerService {
	
	
	
	public static void addCustomer(String customerName) {
		System.out.println("Müþteri Eklendi: " + customerName);
	}
	
	public static void removeCustomer(String customerName) {
		System.out.println("Müþteri Silindi: " + customerName);
	}
	
	
	public static void addCustomer(String customerName, String lastName) {
		System.out.println("Müþteri Adý ve Soyadý Eklendi");
	}
	
}
