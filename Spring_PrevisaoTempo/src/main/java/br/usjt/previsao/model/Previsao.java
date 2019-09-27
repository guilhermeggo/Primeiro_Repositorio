package br.usjt.previsao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	@OneToOne
	@JoinColumn (name = "id_diaSemana")
	private DiaSemana diasemana;
	private String cidade;
	private String semana;
	private int tempmin;
	private int tempmax;
	private int humidade;
	private String descricao;
	private int latitude;
	private int longitude;
	private String hora;
}
