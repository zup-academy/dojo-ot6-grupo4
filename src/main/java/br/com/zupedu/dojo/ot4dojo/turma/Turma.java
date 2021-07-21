package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(unique = true)
	private String nome;
	
	@FutureOrPresent
	private LocalDate iniciaEm;
	
	@FutureOrPresent
	private LocalDate terminaEm;

	public Turma(LocalDate terminaEm, LocalDate iniciaEm, String nome) {
		this.terminaEm = terminaEm;
		this.iniciaEm = iniciaEm;
		this.nome = nome;
	}
	
	
	
	
	
}
