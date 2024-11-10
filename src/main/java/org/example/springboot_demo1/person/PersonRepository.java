package org.example.springboot_demo1.person;

import org.springframework.data.repository.ListCrudRepository;
import org.example.springboot_demo1.person.entity.Person;

public interface PersonRepository extends ListCrudRepository<Person, Integer> {
}
