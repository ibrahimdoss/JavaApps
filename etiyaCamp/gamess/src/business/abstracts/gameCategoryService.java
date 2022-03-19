package business.abstracts;

import java.util.ArrayList;

import business.concretes.GameCategory;

public class gameCategoryService {
	ArrayList<GameCategory> gameCategories = new ArrayList<GameCategory>();
	
	
	public void add(GameCategory gameCategory) {
		gameCategories.add(gameCategory);
		
	}
}
