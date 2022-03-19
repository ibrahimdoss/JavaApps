package loops;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * for(int i=0; i<5; i++) { for(int k=0;k<5; k++) { System.out.println(i+ " : "
		 * + k); } }
		 */
		
		
	}
	
	public void basicLoops() {
		
		String[] products= {"Acer Laptop","Asus Laptop","Dell Laptop","Mac laptop"};
		
		int i=0;
		
		while(i <products.length) {
			System.out.println(products[i]);
			i++;
			
		}
		
		for(String product:products) {
			System.out.println(product);
		//foreach döngüsü.				
		}
		
		
		for (int j = 0; j < products.length; j++) {
			System.out.println(products[j]);
		}
		
		
		
		for(int k=0; k<10; k++) {
			if(k==5) {
				continue;
			}
			System.out.println(k);
		}
		System.out.println("Finish");
		
	}
	//short
}
