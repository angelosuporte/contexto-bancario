package com.aprendendo.contexto_bancario.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	private int agency;
	
	@Column(precision = 13, scale = 2)
	private BigDecimal balance;
	
	//Importante o name abaixo para nao confundir com a palavra limit por ser uma palavra reservada do sistema
	@Column(name ="additional_limit", precision = 13, scale = 2)
	private BigDecimal limit;
	
	public Account() {
	}
	
	public Account(String number, int agency, BigDecimal balance, BigDecimal limit) {
		super();
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.limit = limit;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAgency() {
		return agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
