package org.generation.blogPessoalTeste.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoalTeste.model.Postagem;
import org.generation.blogPessoalTeste.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/postagem")
@CrossOrigin ("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	
	@GetMapping ("/all")
	public List<Postagem> findAll(){
		return repository.findAll();
	}
	
	@GetMapping ("/Id")
	public Optional<Postagem> findById(){
		return repository.findById((long) 3);
	}
	
	@GetMapping ("/titulo")
	public List<Postagem> getByTitulo () {
		return repository.getByTituloContainingIgnoreCase("Cores");
	}

	
	/*
	@GetMapping ("/Id")
	public Postagem encontraPorId(){
		return repository.getById((long) 3);
	}
	*/
	
	
	/*
	@GetMapping ("/Id")
	public List<Postagem> findAllById(){
		return repository.findAllById(long id);
	}
	*/
	
	/*@GetMapping ("/teste")
	public List<Postagem> getById(){
		return repository.getById(1);
	}
	*/
	
	
	
	/*public void findAll(PostagemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public void ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(StudentServiceImpl.findAll());

*/
	
}
