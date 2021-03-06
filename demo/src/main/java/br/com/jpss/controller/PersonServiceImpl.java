package br.com.jpss.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;

import br.com.jpss.model.Person;
import br.com.jpss.repository.PersonRepository;
import br.com.jpss.services.PersonService;

@Controller
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;
	
	private final Gson gson = new Gson();

	@Override
	public Response create(String body) {
		Person person = this.gson.fromJson(body, Person.class);
		this.personRepository.saveAndFlush(person);		
		
		return Response.ok().build();
	}

	@Override
	public Response update(Long id, String body) {
		this.personRepository.findById(id);
		
		return null;
	}

	@Override
	public Response find(Long id) {
		Optional<Person> person = this.personRepository.findById(id);
		return Response.ok(person).build();
	}

	@Override
	public Response list(String name) {
		List<Person> people = this.personRepository.findByFiltro(name);
		return Response.ok(people).build();
	}

	@Override
	public Response delete(Long id) {
		this.personRepository.deleteById(id);
		return Response.ok().build();
	}

}
