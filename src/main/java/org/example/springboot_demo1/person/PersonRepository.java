package org.example.springboot_demo1.person;

import org.example.springboot_demo1.person.entity.Person;
import org.springframework.data.repository.ListCrudRepository;

public interface PersonRepository extends ListCrudRepository<Person, Integer> {
}
