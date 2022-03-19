package com;

import business.abstracts.ProductService;
import business.concretes.DatabaseLogger;
import business.concretes.PostreSqlRepository;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductService(new PostreSqlRepository(),new DatabaseLogger());
		
		productService.add();
		productService.list();
		
		
	}

}
//repository görürsek veritabaný iþlemlerinin yapýldýðý class

//Yeni özellik eklediðinde varolan classlarý deðiþtiremezsin.
//buna open closed principle denir.