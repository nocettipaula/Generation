package com.escola.escola_Marlon.repository;

import java.util.List;

import com.escola.escola_Marlon.model.TurmaMarlon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaMarlonRepository extends JpaRepository<TurmaMarlon, Long> 
{
	//public List<TurmaMarlon> fidAllByTituloContainingIgnoreCase (String titulo);
}
