package entities.concretes;

public class Product {
	private int id;
	private int categoryId;
	private String name;
	private int unitsInStock;
	private String quantityPerUnit;
	private double unitPrice;
	
	public Product() {
		super();
	}

	public Product(int id, int categoryId, String name, int unitsInStock, String quantityPerUnit, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
