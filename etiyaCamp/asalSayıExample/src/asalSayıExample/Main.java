package asalSayıExample;

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
			System.out.println("Sayı Asaldır.");
		}else {
			System.out.println("Sayı Asal Değildir.");
		}


	}

}
