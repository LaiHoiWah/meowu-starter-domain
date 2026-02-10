package com.meowu.starter.domain.commons.enums;

public interface IntEnum<T extends Enum<T> & IntEnum<T>>{

    Integer getCode();

    String getDescription();
}
