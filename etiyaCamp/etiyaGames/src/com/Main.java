package com;

import business.abstracts.GameCategoryService;
import business.concretes.GameCategory;

public class Main {

	public static void main(String[] args) {
		
		GameCategoryService gameCategoryService = new GameCategoryService();
		
		for (GameCategory gameCategory : gameCategoryService.getAll()) {
			System.out.println(gameCategory);
		}
	}

}
