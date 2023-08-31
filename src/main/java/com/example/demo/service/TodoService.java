package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoMapper;

@Service
public class TodoService {
	@Autowired
	TodoMapper todoMapper;

	public List<Todo> getAllTodos() {
		return todoMapper.getAllTodos();
	}

	public List<Todo> getTodo(String id) {
		return todoMapper.getTodo(id);
	}
}
