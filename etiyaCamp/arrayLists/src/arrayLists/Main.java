package arrayLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//arrayListIntro();
		
		//arrayListWithClasses();
		
		
		
		
		
		
	}



//Array
	
//String bir arraylist yazmak istiyoruz.





	
	
	
	
	
	private static void arrayListWithClasses() {
		ArrayList<CartItem> cart = new ArrayList<CartItem>();
		
		cart.add(new CartItem(1,"Laptop"));
		cart.add(new CartItem(3,"Bardak"));
		
		CartItem cartItem1 = new CartItem(4,"Powerbank");
		cart.add(cartItem1);
		
		CartItem cartItem2= new CartItem();
		cartItem2.setQuantity(1);
		cartItem2.setProductName("Mic");
		
		cart.add(cartItem2);
		
		
		for(CartItem item : cart) {
			System.out.println(item.getProductName());
		}
	}

	
	
	
	
	
	
	
	
	private static void arrayListIntro() {
		String[] cities= {"Ankara","Ýstanbul","izmir"};
		//System.out.println(cities.length);
		cities[0]="Adana";
		//System.out.println(cities[0]);
		//System.out.println(cities[1]);
		//System.out.println(cities[2]);
		cities = new String[4];
		//System.out.println(cities[0]);
		
		//GENERÝC
		//generic çalýþtýðýmýz arraylistdeki veri tipini belirlemek.
		//buna type safety demek.
		ArrayList<String> cities2=new ArrayList<String>();
		
		//add ile yeni eleman ekleriz.
		cities2.add("Ankara");
		cities2.add("istanbul");
		cities2.add("izmir");
		System.out.println(cities2.size());
		//arraylistlerde set ile eleman deðiþtirebiliriz.
		//bunu da set ile yaparýz
		cities2.set(0, "Adana");
		//get ile de okuruz.
		System.out.println(cities2.get(0));
		System.out.println(cities2.get(1));
		System.out.println(cities2.get(2));
		
		
		cities2.add("Bursa");
		
		System.out.println(cities2.get(3));
	}

}
