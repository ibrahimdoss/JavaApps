package com;

import java.util.ArrayList;

import entities.concretes.Category;
import entities.concretes.Products;

public class Main {

	public static void main(String[] args) {
		
		Products product1 =new Products(1,"Asus Laptop",1000);
		Products product2= new Products(2,"acer laptop",900);
		Products product3= new Products(3,"kraker laptop",2);
		
		
		ArrayList<Products> products = new ArrayList<Products>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("Teknoloji");
		category.setProducts(products);
		
		System.out.println(category.getProducts());
		
		

	}

}
