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
//repository g�r�rsek veritaban� i�lemlerinin yap�ld��� class

//Yeni �zellik ekledi�inde varolan classlar� de�i�tiremezsin.
//buna open closed principle denir.