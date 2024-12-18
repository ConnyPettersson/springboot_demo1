package org.example.springboot_demo1.playground;

import org.example.springboot_demo1.entity.Playground;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayGroundController {

    private final PlaygroundService playgroundService;

    public PlayGroundController(PlaygroundService playgroundService) {
        this.playgroundService = playgroundService;
    }

    @GetMapping("/playgrounds")
    public List<Playground> allPlaygrounds() {
        return playgroundService.all();
    }
}