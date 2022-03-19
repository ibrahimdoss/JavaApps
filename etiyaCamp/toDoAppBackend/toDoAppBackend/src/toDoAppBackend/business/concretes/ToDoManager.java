package toDoAppBackend.business.concretes;

import java.util.List;

import toDoAppBackend.business.abstracts.ToDoService;
import toDoAppBackend.dataAccess.abstracts.ToDoDao;
import toDoAppBackend.entities.concretes.ToDo;

public class ToDoManager implements ToDoService{

	ToDoDao toDoDao;
	public ToDoManager(ToDoDao toDoDao) {
		super();
		this.toDoDao = toDoDao;
	}

	@Override
	public void add(ToDo toDo) {
		this.toDoDao.add(toDo);
		
	}

	@Override
	public List<ToDo> getAll() {
		
		return this.toDoDao.getAll();
	}

	@Override
	public void update(ToDo toDo) {
		this.toDoDao.update(toDo);
		
	}

	@Override
	public void delete(ToDo toDo) {
		this.toDoDao.delete(toDo);
		
	}

	@Override
	public void completedToDo(int id) {
		for (ToDo toDo : this.toDoDao.getAll()) {
			if (toDo.getId()== id) {
				toDo.setCompleted(true);
			} 
		}
		
	}
	
	

}
