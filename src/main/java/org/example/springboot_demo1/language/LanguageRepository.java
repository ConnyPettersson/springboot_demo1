package org.example.springboot_demo1.language;

import org.example.springboot_demo1.entity.LanguageEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

interface LanguageRepository extends ListCrudRepository<LanguageEntity, Integer> {

    Optional<LanguageEntity> findByName(String name);
}