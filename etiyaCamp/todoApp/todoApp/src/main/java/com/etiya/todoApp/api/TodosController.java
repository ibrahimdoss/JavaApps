package com.etiya.todoApp.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.todoApp.business.abstracts.TodoService;
import com.etiya.todoApp.entities.concretes.Todo;

@RestController
@RequestMapping("/api/todos")
public class TodosController {
	
	private TodoService todoService;

	public TodosController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	@GetMapping("/getall")
	public List<Todo> getAll(){
		return this.todoService.getAll();
	}
	
	@GetMapping("/getbyuserıd")
	public List<Todo> getByUserId(int userId){
		return this.todoService.getByUserId(userId);
	}
	
	@GetMapping("/getbycompleted")
	public List<Todo> getByCompleted(boolean Completed){
		return this.todoService.getByCompleted(Completed);
	}
	

}
