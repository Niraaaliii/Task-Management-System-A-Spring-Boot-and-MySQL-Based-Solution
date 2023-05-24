package com.project_to_do.to_do_resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@Autowired
	ToDoService todoService;
	
	@GetMapping(value="/todo")
	public List<ToDo> getAllToDos(){
		return todoService.getAllTodo();
	}
	
	@GetMapping(value="/todo/{id}")
	public Optional<ToDo> getToDobyID(@PathVariable Integer id){
		return todoService.getToDobyID(id);
	}
	
	@PostMapping(value="/todo")
	public String addToDo(@RequestBody ToDo todo) {
		todoService.addToDo(todo);
		return "Added one to-do !";
	}
	
	@PutMapping(value="/todo/{id}")
	public String updateToDo(@RequestBody ToDo todo,@PathVariable Integer id) {
		todoService.updateToDo(id, todo);
		return "Updated one to-do !";
	}
	
	@DeleteMapping(value="/todo/{id}")
	public String deleteToDo(@PathVariable Integer id) {
		todoService.deleteToDo(id);
		return "Delete one to-do !";
	}
}
