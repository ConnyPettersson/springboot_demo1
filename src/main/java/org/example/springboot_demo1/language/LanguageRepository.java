package org.example.springboot_demo1.language;

import org.example.springboot_demo1.person.entity.Language;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface LanguageRepository extends ListCrudRepository<Language, Integer> {

    Optional<Language> findByName(String name);
}
