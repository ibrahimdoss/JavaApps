package toDoAppBackend.business.concretes;

import java.util.List;

import toDoAppBackend.business.abstracts.UserService;
import toDoAppBackend.dataAccess.abstracts.UserDao;
import toDoAppBackend.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if (!this.checkEmail(user)) {
			this.userDao.add(user);
		} else {
			System.out.println("Email adresi kullanılıyor");
		}
	}

	@Override
	public List<User> getAll() {

		return this.userDao.getAll();
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);

	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);

	}

	private boolean checkEmail(User user) {
		for (User user1 : this.userDao.getAll()) {
			if (user1.getEmail() == user.getEmail()) {
				return true;
			}
		}
		return false;
	}
}
