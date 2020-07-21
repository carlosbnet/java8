package br.com.startsl.springmvc.dominios;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Album {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Nome é necessario")
	@NotNull(message = "nome es necessario!!!!")
	private String nome;

	@Min(value = 1990, message = "Ano nao pode ser menor que 1990")
	@Max(value = 2020, message = "Ano nao pode ser maior que 2020")
	private int anoLacamento;
	
	@OneToMany(mappedBy = "album",fetch = FetchType.EAGER,cascade = CascadeType.MERGE,orphanRemoval = true)
	private Set<Musica> musicas;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLacamento() {
		return anoLacamento;
	}

	public void setAnoLacamento(int anoLacamento) {
		this.anoLacamento = anoLacamento;
	}

	public Set<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(Set<Musica> musicas) {
		this.musicas = musicas;
	}
	
	
	

}