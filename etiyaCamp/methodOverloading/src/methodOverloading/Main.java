package methodOverloading;

public class Main {

	public static void main(String[] args) {
		sayHello();
		sayHello("Hola");

	}
	
	public static void sayHello() {
		System.out.println("Merhaba");
	}
	
	public static void sayHello(String message) {
		System.out.println(message);
	}
}

// ayný isimli  ama farklý parametrelerle  iki method oluþturabiliriz.
//bunada OVERLOADING denir. methodlara aþýrý yükleme yaparýz.