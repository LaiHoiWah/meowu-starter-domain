package com.meowu.starter.domain.commons.utils;

import com.meowu.starter.domain.commons.enums.IntEnum;

import java.util.Objects;

public class IntEnumReflectUtils{

    private IntEnumReflectUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T extends Enum<T> & IntEnum<T>> T getByCode(Class<T> type, Integer code){
        if(Objects.isNull(type)){
            throw new IllegalArgumentException("Enum type must not be null");
        }
        if(Objects.isNull(code)){
            return null;
        }

        for(T entity : type.getEnumConstants()){
            if(entity.getCode().equals(code)){
                return entity;
            }
        }

        throw new IllegalArgumentException("No matched with code: " + code);
    }
}
