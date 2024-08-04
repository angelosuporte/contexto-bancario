package com.aprendendo.contexto_bancario.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aprendendo.contexto_bancario.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//verificar se o numero do account existe
	
	boolean existsByAccountNumber(String accountNumber);
}
