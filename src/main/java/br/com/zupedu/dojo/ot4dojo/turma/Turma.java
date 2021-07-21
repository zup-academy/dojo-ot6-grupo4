package br.com.zupedu.dojo.ot4dojo.turma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private DateLocalTime iniciaEm;
	
	private DateLocalTime terminaEm;
	
}
