package com.aprendendo.contexto_bancario.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_card")
public class Card {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name ="available_limit", precision = 13, scale = 2) //https://stackoverflow.com/questions/75862838/hibernate6-throw-exception-scale-has-no-meaning-for-floating-point-numbers
	private BigDecimal limit;   //<<<--------estava double
	
	public Card() {
	}

	public Card(String number, BigDecimal limit) {
		super();
		this.number = number;
		this.limit = limit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
