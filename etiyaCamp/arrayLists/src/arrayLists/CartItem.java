package arrayLists;

public class CartItem {
	
	private int quantity;
	private String productName;
	public CartItem() {
		
	}
	public CartItem(int quantity, String productName) {
		
		this.quantity = quantity;
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
