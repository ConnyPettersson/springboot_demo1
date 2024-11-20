package org.example.springboot_demo1.person.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.example.springboot_demo1.person.valueObjects.SocialPlatform;

@Converter
public class SocialPlatformConverter implements AttributeConverter<SocialPlatform, String> {
    @Override
    public String convertToDatabaseColumn(SocialPlatform attribute) {
        return attribute.platformName();
    }

    @Override
    public SocialPlatform convertToEntityAttribute(String dbData) {
        return new SocialPlatform(dbData);
    }
}