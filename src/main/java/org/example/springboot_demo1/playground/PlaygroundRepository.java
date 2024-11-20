package org.example.springboot_demo1.playground;

import org.example.springboot_demo1.entity.Playground;
import org.springframework.data.repository.ListCrudRepository;

public interface PlaygroundRepository extends ListCrudRepository<Playground, Integer> {
}