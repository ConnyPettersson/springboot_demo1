package org.example.springboot_demo1.person.dto;

import org.example.springboot_demo1.person.valueObjects.SocialPlatform;
import org.example.springboot_demo1.entity.SocialMediaEntity;

public record SocialMediaDto(SocialPlatform platform) {
    public static SocialMediaDto from(SocialMediaEntity socialMedia) {
        return new SocialMediaDto(socialMedia.getPlatform());
    }
}