package com.alissonwenceslau.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonwenceslau.workshopmongo.domain.User;
import com.alissonwenceslau.workshopmongo.dto.UserDTO;
import com.alissonwenceslau.workshopmongo.repository.UserRepository;
import com.alissonwenceslau.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public void delete (String id) {
		findById(id);
		repository.deleteById(id);
	}
	//O 'User obj' são os dados que o usuário enviará na requisição
	public User update(User obj) {
		//Busca o objeto original no banco
		Optional<User> newObj = repository.findById(obj.getId());
		
		//Método responsável por copiar os dados do parâmeto 'obj' para o 'newObj'
		updateData(newObj, obj);
		
		return repository.save(newObj.get());
	}

	private void updateData(Optional<User> newObj, User obj) {
		newObj.get().setName(obj.getName());
		newObj.get().setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}
}
