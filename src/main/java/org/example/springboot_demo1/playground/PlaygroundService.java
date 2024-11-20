package org.example.springboot_demo1.playground;

import org.example.springboot_demo1.entity.Playground;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaygroundService {
    private final PlaygroundRepository playgroundRepository;

    public PlaygroundService(PlaygroundRepository playgroundRepository) {
        this.playgroundRepository = playgroundRepository;
    }

    public List<Playground> all() {
        return playgroundRepository.findAll();
    }
}