package com.minharedesocial.redeSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minharedesocial.redeSocial.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> 
{
	//public List<Tartaruga> findAllByDescricaoContainingIgnoreCase (String descricao);

}
