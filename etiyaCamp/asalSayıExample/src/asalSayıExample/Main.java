package asalSay�Example;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		int kalan = number % 2 ;
		boolean isPrime=true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}
		}
		
		if (isPrime) {
			System.out.println("Say� Asald�r.");
		}else {
			System.out.println("Say� Asal De�ildir.");
		}


	}

}
