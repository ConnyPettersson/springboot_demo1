package org.example.springboot_demo1.language.api;

public interface LanguageService {
    Language getLanguageOrCreate(String languageName);
}