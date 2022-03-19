package classMethods;

public class Main {

	public static void main(String[] args) {
		
		CartService cartService = new CartService();
		
		cartService.addToCart("Armut");
		cartService.addToCart("Muz");
		cartService.removeFromCart("Armut");
		cartService.listCart();
	}

}


//classlarýn en temel aracý methodlarý gruplar.