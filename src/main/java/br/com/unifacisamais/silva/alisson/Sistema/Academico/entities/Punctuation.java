package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Punctuation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private SchoolCard card;
	
	private Integer value;
	
	
	private String Namediscipline;
	
	public Punctuation() {}

	public Punctuation(String nameDiscipline , SchoolCard schoolCard) {
		this.value = 0;
		this.Namediscipline = nameDiscipline ;
		this.card = schoolCard;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public SchoolCard getCard() {
		return card;
	}

	public String getNamediscipline() {
		return Namediscipline;
	}

	
}
	
	

