package com.gabriel.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
