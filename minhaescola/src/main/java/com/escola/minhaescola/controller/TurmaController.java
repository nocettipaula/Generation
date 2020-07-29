package com.escola.minhaescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.minhaescola.model.Turma;
import com.escola.minhaescola.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController
{
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping 																
	public ResponseEntity<List<Turma>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
		
	}

	@GetMapping("/ {id}")
	public ResponseEntity<Turma> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse (ResponseEntity.notFound(). build());
	
	}
	
	@GetMapping ("/titulo/{titulo}")
	public ResponseEntity<List<Turma>> GetByTitulo(@PathVariable String titulo)
	{
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}
	
	@PostMapping
	public ResponseEntity<Turma> post (@RequestBody Turma turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping
	public ResponseEntity<Turma> put (@RequestBody Turma turma)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	}
	
	@DeleteMapping("/ {id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}


}
