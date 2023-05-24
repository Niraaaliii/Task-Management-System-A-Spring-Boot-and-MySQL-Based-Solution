package com.project_to_do.to_do_resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired
	ToDoRepository todoRepo;
	
	public List<ToDo> getAllTodo(){
		return (List<ToDo>) todoRepo.findAll();
	}
	
	public Optional<ToDo> getToDobyID(Integer id) {
		return todoRepo.findById(id);
		
	}
	
	public void addToDo(ToDo todo) {
		todoRepo.save(todo);
	}
	
	public void updateToDo(Integer id,ToDo todo) {
		Optional<ToDo> todoOld = getToDobyID(id);

		if(!todo.getTitle().isBlank()) todoOld.get().setTitle(todo.getTitle());
		if(!todo.getDescription().isBlank()) todoOld.get().setDescription(todo.getDescription());
		if(!todo.getDate().equals(null)) todoOld.get().setDate(todo.getDate());
		if(!todo.getStatus().equals(null)) todoOld.get().setStatus(todo.getStatus());
		
		todoRepo.save(todoOld.get());
	}
	
	public void deleteToDo(Integer id) {
		todoRepo.deleteById(id);
	}
}
