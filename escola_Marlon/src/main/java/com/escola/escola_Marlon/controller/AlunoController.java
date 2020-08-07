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

import com.escola.escola_Marlon.model.Aluno;
import com.escola.escola_Marlon.model.TurmaMarlon;
import com.escola.escola_Marlon.repository.AlunoRepository;

@RestController
@RequestMapping("/escola/alunos")
@CrossOrigin("*")

public class AlunoController 
{
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> GetAll (){
		return ResponseEntity.ok (alunoRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> GetById(@PathVariable long id) 
	{
		return alunoRepository.findById (id)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Aluno> create(@RequestBody Aluno aluno)
	{
		return ResponseEntity.ok(alunoRepository.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<Aluno> put (@RequestBody Aluno aluno)
	{
		return ResponseEntity.ok(alunoRepository.save(aluno));
	}

	@DeleteMapping ("/{id}")
	public void  deleteById (@PathVariable long id)
	{
		alunoRepository.deleteById (id);
	}
}
