package com.etiya.todoApp.business.abstracts;

import java.util.List;

import com.etiya.todoApp.entities.concretes.Todo;

public interface TodoService {
	
	 List<Todo> getAll();
	 List<Todo> getByUserId(int UserId);
	 List<Todo> getByCompleted(boolean Completed);
}
