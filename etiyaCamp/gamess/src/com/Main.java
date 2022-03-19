package com;

import java.util.ArrayList;

import business.abstracts.GameService;
import business.abstracts.UserService;
import entities.concretes.Game;
import entities.concretes.User;




public class Main {

	public static void main(String[] args) {
		
		GameService gameService = new GameService();
		
		Game gameone=new Game("gta",150,"action");
		Game gametwo=new Game("calf of duty",1500,"fps");
		
		gameService.addGame(gameone);
		gameService.addGame(gametwo);
		System.out.println("--------------");
		
		for (Game  games : gameService.getGames()) {
			System.out.println(games.getName()+" " + games.getGameType()+ " " + games.getPrice() );
		}
		
		
		UserService userService = new UserService();
		
		User userone=new User("ali","yýldýz",25);
		User usertwo=new User("ibrahim","dos",26);
		
		userService.addUser(userone);
		userService.addUser(usertwo);
		System.out.println("--------------");
		
		for (User  users : userService.getUsers()) {
			System.out.println(users.getFirstName()+" " + users.getLastName()+ " " + users.getAge() );
		}
		
		
		
		
		
		
		
		
		
		//for(Game game:gameService.getGames()) {
		//	System.out.println(game.getName());
		//}
		
		
		
		
		
		
		
		/*
		 * UserService userService=new UserService(); User user=new User();
		 * 
		 * user.setAge(16); user.setFirstName("Yaðmur"); user.setLastName("Teke");
		 * 
		 * userService.save(user);
		 */
		

	}

}
