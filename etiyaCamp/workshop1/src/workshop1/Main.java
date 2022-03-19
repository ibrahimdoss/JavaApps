package workshop1;

public class Main {

	public static void main(String[] args) {
		
		 for (int j = 0; j <=1000; j++) {
			 int sayi=j;
			 int toplam = 0;
			 
			 for (int i = 1 ; i < sayi ; i++) {
					if(sayi %i == 0)  
						toplam += i;
				}
				
			 	if (toplam == sayi) 
					System.out.println(sayi + " mükemmel bir sayidir"+ sayi);
				
			
		}
			 
			 
			 
		}
		

}



