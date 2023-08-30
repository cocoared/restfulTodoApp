package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoMapper;

@RestController
public class TodoController {

	@Autowired TodoMapper todoMapper;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoMapper.getAllTodos();
	}
	
}
