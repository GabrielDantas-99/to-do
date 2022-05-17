package com.gabriel.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.todo.domain.Todo;
import com.gabriel.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void InstanciaBD() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		Todo t1 = new Todo(null, "Criar Todo", "Criar todo para teste",
				LocalDateTime.parse("25/03/2022 10:15", formatter), false);
		
		Todo t2 = new Todo(null, "Ler Todo", "Ler todo para teste", 
				LocalDateTime.parse("26/03/2022 10:15", formatter),
				true);
		Todo t3 = new Todo(null, "Editar Todo", "Editar todo para teste",
				LocalDateTime.parse("27/03/2022 10:15", formatter), false);
		
		Todo t4 = new Todo(null, "Deletar Todo", "Deletar todo para teste",
				LocalDateTime.parse("28/03/2022 10:15", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
