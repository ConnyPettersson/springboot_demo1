package org.example.springboot_demo1.person.dto;

import org.example.springboot_demo1.entity.PersonEntity;

import java.util.Set;
import java.util.stream.Collectors;

public record PersonWithSocialMedia(String name, Set<SocialMediaDto> socialMedias) {
    public static PersonWithSocialMedia fromPerson(PersonEntity person) {
        return new PersonWithSocialMedia(person.getFullName(),
                person.getSocialMedias().stream().map(SocialMediaDto::from)
                        .collect(Collectors.toSet()));
    }
}