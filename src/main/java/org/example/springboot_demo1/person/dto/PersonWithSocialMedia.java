package org.example.springboot_demo1.person.dto;

import org.example.springboot_demo1.person.entity.Person;

import java.util.List;

public record PersonWithSocialMedia(String name, List<SocialMediaDto> socialMedias) {
    public static PersonWithSocialMedia fromPerson(Person person) {
        return new PersonWithSocialMedia(person.getFullName(),
                   person.getSocialMedia().stream().map(SocialMediaDto::from).toList());
    }
}
