package toDoAppBackend.dataAccess.concretes.Jpa;

import java.util.ArrayList;
import java.util.List;

import toDoAppBackend.dataAccess.abstracts.ToDoDao;
import toDoAppBackend.entities.concretes.ToDo;

public class JpaToDoDao implements ToDoDao {
	List<ToDo> toDos;

	public JpaToDoDao() {
		super();
		this.toDos = new ArrayList<ToDo>();
	}

	@Override
	public void add(ToDo entity) {
		this.toDos.add(entity);

	}

	@Override
	public List<ToDo> getAll() {

		return this.toDos;
	}

	@Override
	public void update(ToDo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ToDo entity) {
		this.toDos.remove(entity);

	}
}
