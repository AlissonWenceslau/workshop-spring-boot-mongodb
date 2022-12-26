package com.alissonwenceslau.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonwenceslau.workshopmongo.domain.Post;
import com.alissonwenceslau.workshopmongo.repository.PostRepository;
import com.alissonwenceslau.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
		
	public Post findById(String id) {
		Optional<Post> user = repository.findById(id);
		
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
}
