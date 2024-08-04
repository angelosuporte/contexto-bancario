package com.aprendendo.contexto_bancario.service;

import com.aprendendo.contexto_bancario.domain.model.User;

public interface UserService {

	User findById(long id);
	User create(User userToCreate);
}
