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

// ayn� isimli  ama farkl� parametrelerle  iki method olu�turabiliriz.
//bunada OVERLOADING denir. methodlara a��r� y�kleme yapar�z.