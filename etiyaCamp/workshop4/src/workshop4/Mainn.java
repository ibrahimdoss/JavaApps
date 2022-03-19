package workshop4;

public class Mainn {

	public static void main(String[] args) {
		
		int x=1;
		
		while(true) {
			for (int y = 1; y < x; y++) {
				int sayi1=x;
				int sayi2=y;
				int topla=0;
				int topla2=0;
				
				for (int i = 1; i < sayi1; i++) {
					if(sayi1 % i == 0 ) {
						topla=topla + i ;
					}
					
				}
				
				for (int i = 1; i < sayi2; i++) {
					if(sayi2 % i == 0 ) {
						topla2=topla2 + i ;
					}
					
				}
				
				if(sayi1==topla2 && sayi2== topla) {
					System.out.println(sayi1 + " - " + sayi2 );
					
				}
			}
			x++;			
		}
	}

}
