package org.example.springboot_demo1.language;

import org.example.springboot_demo1.language.api.Language;
import org.example.springboot_demo1.entity.LanguageEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class LanguageService implements org.example.springboot_demo1.language.api.LanguageService {

    LanguageRepository repository;

    public LanguageService(LanguageRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public Language getLanguageOrCreate(String languageName) {
        return repository.findByName(languageName)
                .map(language -> new Language(language.getId(), language.getName()))
                .orElseGet(() -> {
                    LanguageEntity newLanguageEntity = repository.save(new LanguageEntity(languageName));
                    return new Language(newLanguageEntity.getId(), newLanguageEntity.getName());
                });
    }
}