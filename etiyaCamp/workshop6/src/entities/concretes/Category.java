package entities.concretes;

import java.util.ArrayList;

public class Category {
	private int id;
	private String name;
	private ArrayList<Products> products;
	
	public Category() {
		products=new ArrayList<Products>();
	}
	
	public Category(int id,String name) {
		this();
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Products> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Products> products) {
		this.products = products;
	}
}
