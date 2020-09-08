package hy.pro.jpa.service;

import java.util.List;
import java.util.Optional;

import hy.pro.jpa.model.Person;

public interface PersonService {
	Person createPerson(Person person);
	
	void deletePerson(Long id);
	
	List<Person> getAllPerson();
	
	Optional<Person> getPerson(Long id);
	Person updatePerson(Person person);
}
