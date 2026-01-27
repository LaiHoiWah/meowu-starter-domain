package com.meowu.starter.domain.commons.enums;

public interface StringEnum<T extends Enum<T> & StringEnum<T>>{

    String getCode();

    String getDescription();
}
