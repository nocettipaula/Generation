package com.escola.escola_Marlon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.escola_Marlon.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>

{
	// public List<TurmaMarlon> fidAllByTituloContainingIgnoreCase (String nome);
}