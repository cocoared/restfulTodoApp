package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.entity.TodoWithoutId;
import com.example.demo.service.TodoService;

@RestController
public class TodoController {

	@Autowired TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@GetMapping("/todos/{id}")
	public List<Todo>getTodo(@PathVariable("id") String id){
		return todoService.getTodo(id);
	}	
	
	@PostMapping("/todos")
		public record addTodo(@RequestBody TodoWithoutId todoWithoutId) {
			todoService.addTodo(todoWithoutId);
		}

//		@PutMapping("/todos/{todoId}")
//		public void updateTodo(@PathVariable("todoId") String todoId, @RequestBody Todo todo) {
//			todoService.updateTodo(todoId, todo);
//		}
//
//		@DeleteMapping("/todos/{todoId}")
//		public void deleteTodo(@PathVariable("todoId") String todoId) {
//			todoService.deleteTodo(todoId);
//		}
	}
}
