package hy.pro.jpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hy.pro.jpa.model.Person;
import hy.pro.jpa.repository.PersonRepository;
import hy.pro.jpa.service.PersonService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
	
	private final PersonRepository repo;
	
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public Optional<Person> getPerson(Long id) {
		return repo.findById(id);
	}
	
	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

}
