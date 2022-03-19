package business.abstracts;

import java.util.ArrayList;

import entities.concretes.Game;

public class GameService {
	
	ArrayList<Game> games = new ArrayList<Game>();
	
	public void add(Game game) {
		System.out.println(game.getGameName()+ " adl� oyun sisteme kaydedildi.");
		this.games.add(game);
	}
	
	
	public ArrayList<Game> getAll(){
		
		Game game1= new Game();
		game1.setGameName("cs go");
		game1.setGamePrice(24);
		
		this.games.add(game1);
		
		return this.games;
	}
}
