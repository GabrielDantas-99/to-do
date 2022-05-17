package com.gabriel.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.todo.domain.Todo;
import com.gabriel.todo.repositories.TodoRepository;

// Camada responsável pela lógica de negócio

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Long id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = repository.findAllOpen();
		return list;
	}

}
