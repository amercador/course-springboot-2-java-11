package com.educaweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educaweb.course.entities.User;
import com.educaweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//metodo para buscar todos os usuarios
	public List<User> findAll() {
		return repository.findAll();
	}

	//metodo para buscar o usuário por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//metodo para inserir um usuario
	public User insert(User obj) {
		return repository.save(obj);
	}

}
