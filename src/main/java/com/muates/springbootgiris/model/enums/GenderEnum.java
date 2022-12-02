package com.muates.springbootgiris.model.enums;

public enum GenderEnum {
    MALE("Erkek"),
    FEMALE("Kadın");

    private String value;

    GenderEnum(String value) {
        this.value = value;
    }
}
