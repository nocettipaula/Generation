package com.escola.minhaescola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.minhaescola.model.Turma;

public interface TurmaRepository extends JpaRepository <Turma, Long>
{
	public List<Turma> findAllByTituloContainingIgnoreCase (String titulo);

}
