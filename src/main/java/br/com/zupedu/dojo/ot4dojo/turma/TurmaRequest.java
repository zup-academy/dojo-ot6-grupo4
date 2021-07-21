package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TurmaRequest {
	
	@Size(max = 50)
	@NotBlank
	private String nome;
	
	@FutureOrPresent
	@NotNull
	private LocalDate iniciaEm;
	
	@Future
	@NotNull
	private LocalDate terminaEm;

	public TurmaRequest(LocalDate terminaEm, LocalDate iniciaEm, String nome) {
		this.terminaEm = terminaEm;
		this.iniciaEm = iniciaEm;
		this.nome = nome;
	}
	
	
	
	
	
}
