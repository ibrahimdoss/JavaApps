package toDoAppBackend.business.abstracts;

import java.util.List;

import toDoAppBackend.entities.concretes.ToDo;

public interface ToDoService {
	void add(ToDo toDo);

	List<ToDo> getAll();

	void update(ToDo toDo);

	void delete(ToDo toDo);
	
	void completedToDo(int id);
}
