package etiyaGamesVol2.business.concretes;

import etiyaGamesVol2.business.abstracts.BaseCalculatorGameService;
import etiyaGamesVol2.business.abstracts.GamePlayService;
import etiyaGamesVol2.entities.Game;
import etiyaGamesVol2.entities.Gamer;

public class GamePlayManager implements GamePlayService {

	BaseCalculatorGameService baseCalculatorGameService;
	
	
	public GamePlayManager(BaseCalculatorGameService baseCalculatorGameService) {
		super();
		this.baseCalculatorGameService = baseCalculatorGameService;
	}


	@Override
	public void play(Gamer gamer, Game game) {
		this.baseCalculatorGameService.calculator(gamer,game);

	}

}
