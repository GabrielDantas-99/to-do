package com.gabriel.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.todo.domain.Todo;
import com.gabriel.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void InstanciaBD() throws  ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Criar Todo", "Criar todo para teste", sdf.parse("25/03/2022"), false);
		
		Todo t2 = new Todo(null, "Ler Todo", "Ler todo para teste", sdf.parse("26/03/2022"), true);
		
		Todo t3 = new Todo(null, "Editar Todo", "Editar todo para teste", sdf.parse("27/03/2022"), false);
		
		Todo t4 = new Todo(null, "Deletar Todo", "Deletar todo para teste", sdf.parse("28/03/2022"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
