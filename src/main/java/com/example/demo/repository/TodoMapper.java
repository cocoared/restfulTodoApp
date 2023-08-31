package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo;
import com.example.demo.entity.TodoWithoutId;

@Mapper
public interface TodoMapper {

	public List<Todo> getAllTodos();

	public List<Todo> getTodo(String id);

	public void addTodo(TodoWithoutId TodoWithoutId);
	
	
	
	public void deleteTodo(String id);
}
