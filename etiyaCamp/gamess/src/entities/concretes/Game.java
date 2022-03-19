package entities.concretes;

public class Game {
	private String name;
	private double price;
	private String gameType;
	
	public Game() {
		
	}
	

	
	public Game(String name, double price, String gameType) {
		
		this.name = name;
		this.price = price;
		this.gameType = gameType;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
}
