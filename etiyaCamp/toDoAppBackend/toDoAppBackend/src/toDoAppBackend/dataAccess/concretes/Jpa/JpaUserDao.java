package toDoAppBackend.dataAccess.concretes.Jpa;

import java.util.ArrayList;
import java.util.List;

import toDoAppBackend.dataAccess.abstracts.UserDao;
import toDoAppBackend.entities.concretes.User;

public class JpaUserDao implements UserDao {
	List<User> users;

	public JpaUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User entity) {
		this.users.add(entity);

	}

	@Override
	public List<User> getAll() {

		return this.users;
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User entity) {
		this.users.remove(entity);

	}
}
