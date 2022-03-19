package business.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public class UserService {
	
	ArrayList<User> users= new ArrayList<User>();
	
	public void addUser(User user) {
		if(user.getAge()<15) {
			System.out.println("Yaþýnýz Uygun Deðildir!");
		}else {
			System.out.println("Kullanýcý Kaydedildi" + user.getFirstName());

		}
		
		
	}
	
	
	
	
	
	
	
	/*
	 * public void save(User user) { if(user.getAge()<15) {
	 * System.out.println("Yaþýnýz Uygun Deðildir!"); }else {
	 * System.out.println("Kullanýcý Kaydedildi" + user.getFirstName());
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	
	
	//private ArrayList<User> users=new ArrayList<User>();
	public   ArrayList<User> getUsers() {
		
			return users;
		
		//users.add(new User("Engin","Yýldýz",14));
		//users.add(new User("Ali","þimþek",26));
		
		
		/*
		 * User user1=new User(); user1.setAge(15); user1.setFirstName("Engin");
		 * user1.setLastName("Yýldýz");
		 * 
		 * 
		 * User user2=new User(); user2.setAge(26); user2.setFirstName("Taha");
		 * user2.setLastName("yýlmaz");
		 * 
		 * return getUsers();
		 */
		
	}
}

//ISTQB
// 7 adet test arama noktalarý 