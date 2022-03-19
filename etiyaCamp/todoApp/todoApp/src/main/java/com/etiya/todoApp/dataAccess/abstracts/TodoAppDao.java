package com.etiya.todoApp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etiya.todoApp.entities.concretes.Todo;

@Repository
public interface TodoAppDao extends JpaRepository<Todo, Integer>{
	
	 List<Todo> getByUserId(int UserId);
	 List<Todo> getByCompleted(boolean Completed);
}
