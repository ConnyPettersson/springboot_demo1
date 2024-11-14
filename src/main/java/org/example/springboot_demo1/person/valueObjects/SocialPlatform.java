package org.example.springboot_demo1.person.valueObjects;

import java.util.Objects;

public record SocialPlatform(String platformName) {

    public SocialPlatform {
        if (platformName == null || platformName.isEmpty())
            throw new IllegalArgumentException();
    }

}
