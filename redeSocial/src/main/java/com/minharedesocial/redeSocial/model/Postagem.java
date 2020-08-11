package com.minharedesocial.redeSocial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "postagem")
public class Postagem 
{
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min= 5, max= 100)
	private String descricao;
	
	private int curtiu;
	
	@ManyToOne
	@JsonIgnoreProperties ({"senha", "email"})
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties ("postagem")
	private Tema tema;
	

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCurtiu() {
		return curtiu;
	}

	public void setCurtiu(int curtiu) {
		this.curtiu = curtiu;
	}
	
	

}
