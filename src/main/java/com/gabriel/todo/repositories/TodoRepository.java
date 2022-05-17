package com.gabriel.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gabriel.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

	@Query("SELECT obj FROM Todo obj WHERE obj.finalizada = false ORDER BY obj.deadLine")
	List<Todo> findAllOpen();

	@Query("SELECT obj FROM Todo obj WHERE obj.finalizada = true ORDER BY obj.deadLine")
	List<Todo> findAllClose();

}
