package etiyaGamesVol2.business.concretes;

import java.time.LocalDate;
import java.time.Period;

import etiyaGamesVol2.business.abstracts.BaseCalculatorGameService;
import etiyaGamesVol2.entities.Game;
import etiyaGamesVol2.entities.Gamer;

public class CalculatorGameManager implements BaseCalculatorGameService {

	@Override
	public void calculator(Gamer gamer, Game game) {
		
		Period yasFarki = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		
		if (yasFarki.getYears()>70) {
			System.out.println(gamer.getFirstName() +" adl� oyuncu ya�l�d�r. "+ game.getGameName() +" taban puan�n "
					+ "%90'�n� al�r. Oyun puan� = "+game.getGamePoint() +" , Puan�n�n�z = "+ game.getGamePoint()*0.9);
			
		}else if(yasFarki.getYears()>=18){
			System.out.println(gamer.getFirstName() +" adl� oyuncu yeti�kindir. "
					+ game.getGameName() + " taban puan�n %70'ini alir. Oyun puan� = " +game.getGamePoint() +" , Puan�n�nz = "+ game.getGamePoint()*0.7);
			
		}else if (yasFarki.getYears()<18) {
			System.out.println(gamer.getFirstName() +" adl� oyuncu �ocuktur. "+ game.getGameName() +" taban puan�n "
					+ "tamam�n� al�r. Oyun puan� = "+game.getGamePoint() +" , Puan�n�z = "+ game.getGamePoint());
		}
		
		
		
		
		
		
		
		
	}

}
