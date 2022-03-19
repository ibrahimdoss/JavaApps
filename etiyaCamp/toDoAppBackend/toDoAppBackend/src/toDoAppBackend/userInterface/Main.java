package toDoAppBackend.userInterface;

import toDoAppBackend.business.abstracts.ToDoService;
import toDoAppBackend.business.abstracts.UserService;
import toDoAppBackend.business.concretes.ToDoManager;
import toDoAppBackend.business.concretes.UserManager;
import toDoAppBackend.dataAccess.concretes.Jpa.JpaToDoDao;
import toDoAppBackend.dataAccess.concretes.Jpa.JpaUserDao;
import toDoAppBackend.entities.concretes.Address;
import toDoAppBackend.entities.concretes.Company;
import toDoAppBackend.entities.concretes.Geo;
import toDoAppBackend.entities.concretes.ToDo;
import toDoAppBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		Geo geo1 = new Geo(1, "-37.3159", "81.1496");
		Address address1 = new Address(1, "ekler sokak", "saz apartman", "istanbul", "34870", geo1);
		Company company1 = new Company(1, "Etiya", "çok katmanlı mimari yapı", "telekom crm");

		User user1 = new User(1, "ibrahim", "gezer", "ibrahimgezer@etiya.com", address1, "055555555", "ibrahim.com.tr",
				company1);
		User user2 = new User(2, "Selim", "sadet", "ibrahimgezer@etiya.com", address1, "055555555", "ibrahim.com.tr",
				company1);

		ToDo toDo1 = new ToDo(1, 1, "etiya");

		UserService userService = new UserManager(new JpaUserDao());
		userService.add(user1);
		userService.add(user2);

		for (User user : userService.getAll()) {
			System.out.println(user.getName());
		}

		ToDoService toDoService = new ToDoManager(new JpaToDoDao());
		toDoService.add(toDo1);
		for (ToDo toDo : toDoService.getAll()) {
			System.out.println(toDo.getTitle() + " " + toDo.isCompleted());
		}

		toDoService.completedToDo(1);

		for (ToDo toDo : toDoService.getAll()) {
			System.out.println(toDo.getTitle() + " " + toDo.isCompleted());
		}

	}

}
