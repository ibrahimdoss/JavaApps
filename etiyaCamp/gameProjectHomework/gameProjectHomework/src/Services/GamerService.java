package Services;

import java.util.ArrayList;

import Adapters.GamerCheckService;
import Adapters.MernisCheckService;
import Entities.Gamer;

public class GamerService implements GamerServiceManager, MernisCheckService {
	GamerCheckService checkGamer;
	ArrayList<Gamer> gamers;

	public GamerService(GamerCheckService checkGamer) {

		gamers = new ArrayList<Gamer>();
		this.checkGamer = checkGamer;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (this.checkGamer.checkGamer(gamer)) {
			System.out.println("Kullan�c� eklendi"+gamer.getFirstName());
			gamers.add(gamer);
		} else {
			System.out.println("Kullan�c� Yanl�� de�er y�z�nden eklenemedi :"+gamer.getFirstName());
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi . : " + gamer.getFirstName());

	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Kullan�c� silindi . : " + gamer.getFirstName());

	}

	public ArrayList<Gamer> getAllGames() {
		System.out.println(this.gamers);
		return this.gamers;

	}

	@Override
	public boolean checkGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		return false;
	}

}
