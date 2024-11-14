package org.example.springboot_demo1.language;

import org.example.springboot_demo1.person.entity.Language;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    LanguageRepository repository;

    public LanguageService(LanguageRepository repository) {
        this.repository = repository;
    }

    public Language getLanguageOrCreate(String languageName) {
        return repository.findByName(languageName)
                .orElseGet(
                        () -> repository.save(new Language(languageName)));
    }
}
