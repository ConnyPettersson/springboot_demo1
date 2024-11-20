package org.example.springboot_demo1.person.projection;

import org.example.springboot_demo1.person.valueObjects.SocialPlatform;

import java.util.Set;

public interface PersonWithSocialMediaProjection {
    String getFullName(); // Maps to `getFullName()` in PersonEntity
    Set<SocialMediaProjection> getSocialMedias(); // Maps to the socialMedias relationship

    interface SocialMediaProjection {
        SocialPlatform getPlatform(); // Maps to the platform in SocialMediaEntity
    }
}