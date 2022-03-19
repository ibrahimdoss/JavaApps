package com.etiya.todoApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.todoApp.business.abstracts.TodoService;
import com.etiya.todoApp.dataAccess.abstracts.TodoAppDao;
import com.etiya.todoApp.entities.concretes.Todo;

@Service
public class TodoManager  implements TodoService{

	private TodoAppDao todoAppDao;
	
	@Autowired
	public TodoManager(TodoAppDao todoAppDao) {
		super();
		this.todoAppDao = todoAppDao;
	}

	@Override
	public List<Todo> getAll() {
		return this.todoAppDao.findAll();
	}

	@Override
	public List<Todo> getByUserId(int UserId) {
		return this.todoAppDao.getByUserId(UserId);
	}

	@Override
	public List<Todo> getByCompleted(boolean Completed) {
		return this.todoAppDao.getByCompleted(Completed);
	}

}
