package Services;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class SellingService implements SellingServiceManager {

	@Override
	public void sellGame(Gamer gamer, Game game,Offer offer) {
		
		System.out.println(gamer.getFirstName()+" adl� oyuncu "+game.getGameName()+" adl� oyunu"+offer.getOfferName()+" ile sat�n ald�. ");
		
		
		
	}

}
