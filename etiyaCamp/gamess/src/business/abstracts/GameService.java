package business.abstracts;

import java.util.ArrayList;

import entities.concretes.Game;

public class GameService {
	/*
	 * public void save(Game game) { System.out.println("Oyun kaydedildi." +
	 * game.getName()); }
	 */
	
	private ArrayList<Game> games=new ArrayList<Game>();

	public  void addGame(Game game){
		
		System.out.println("Eklendi");
		games.add(game);
		
		
		
		
		/*
		 * Game game1=new Game(); game1.setName("Gta"); game1.setGameType("Action");
		 * game1.setPrice(1000);
		 * 
		 * Game game2=new Game(); game2.setName("Call of duty");
		 * game2.setGameType("FPS"); game2.setPrice(1000);
		 * 
		 * Game[] games= {game1, game2}; return games;
		 */
		
		
	}
	
	public ArrayList<Game> getGames(){
		return games;
	}
}
