package business.concretes;

import business.abstracts.GamePlayService;
import business.abstracts.ScoreService;
import entities.concretes.Gamer;

public class OldsScoreCalculator implements ScoreService {

	GamePlayService gamePlayService= new GamePlayManager();
	
	
	
	@Override
	public double calculateScore(Gamer gamer, double points) {
		if (gamePlayService.calculateAge(gamer)!= 1) {
			System.out.println("Ya��n�z B�y�k!");
			return 0;

		}else{
			System.out.println(gamer.getFirstName()+ " Adl� oyuncu " + "Toplanan puan : " + points*0.90);
			return points * 0.90;
		}
	}
}
