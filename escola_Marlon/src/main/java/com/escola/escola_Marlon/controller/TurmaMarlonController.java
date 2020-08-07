package com.escola.escola_Marlon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.escola.escola_Marlon.model.TurmaMarlon;
import com.escola.escola_Marlon.repository.TurmaMarlonRepository;

@RestController
@RequestMapping("/escola/turmas")
@CrossOrigin("*")
public class TurmaMarlonController 
{
	@Autowired
	private TurmaMarlonRepository repository;
	
	@GetMapping
	public ResponseEntity<List<TurmaMarlon>> GetAll (){
		return ResponseEntity.ok (repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TurmaMarlon> GetById(@PathVariable long id) 
	{
		return repository.findById (id)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<TurmaMarlon> create(@RequestBody TurmaMarlon turmaMarlon)
	{
		return ResponseEntity.ok(repository.save(turmaMarlon));
	}
	
	@PutMapping
	public ResponseEntity<TurmaMarlon> post (@RequestBody TurmaMarlon turmaMarlon)
	{
		return ResponseEntity.ok(repository.save(turmaMarlon));
	}
	
	@DeleteMapping ("/{id}")
	public void  deleteById (@PathVariable long id)
	{
		repository.deleteById (id);
	}
	
}