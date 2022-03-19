package toDoAppBackend.business.abstracts;

import java.util.List;

import toDoAppBackend.entities.concretes.User;

public interface UserService {
	void add(User user);

	List<User> getAll();

	void update(User user);

	void delete(User user);
}
