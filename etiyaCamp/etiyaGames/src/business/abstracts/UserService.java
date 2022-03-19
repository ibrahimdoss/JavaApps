package business.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public class UserService {

	ArrayList<User> users = new ArrayList<User>();

	public void add(User user) {

		if (user.getAge() >= 15) {
			
			System.out.println(user.getFirstName() + " adl� kullan�c� sisteme kaydedildi");
			
			this.users.add(user);
			
		} else if (user.getAge() < 0) {
			System.out.println("Ge�ersiz kullan�c� ya��");
			
		} else {
			System.out.println("15 ya��ndan k���kler sisteme kay�t olamaz");
		}
	}

	public ArrayList<User> getAll() {

		User user1 = new User();
		user1.setFirstName("�brahim");
		user1.setLastName("dos");
		user1.setAge(23);

		this.users.add(user1);

		return this.users;
	}
	
	
	
	
	
	
	
}
