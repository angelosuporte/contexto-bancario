package com.aprendendo.contexto_bancario.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.aprendendo.contexto_bancario.domain.model.User;
import com.aprendendo.contexto_bancario.domain.repository.UserRepository;
import com.aprendendo.contexto_bancario.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository; //camada de acesso a dados
	
	public UserServiceImpl(UserRepository userRepository) { //vai injetar via construtor
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	 public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("Numero da conta ja existe!");
		}
	
		return userRepository.save(userToCreate);
	
	}
	/**
	 * Outra opcao de verificacao
	 *public User create(User userToCreate) {
		if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("Usuario ja existe!");
		}
		return null;

	 */
	
}
