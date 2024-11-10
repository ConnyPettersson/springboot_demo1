package org.example.springboot_demo1.person;

import org.example.springboot_demo1.person.entity.Person;

public record PersonDto(String name, boolean programmer) {

    public static PersonDto fromPerson(Person person) {
        return new PersonDto(person.getName(), person.getProgrammer());
    }
}
