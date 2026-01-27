package com.meowu.starter.domain.commons.enums;

import com.meowu.starter.domain.commons.utils.StringEnumReflectUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum RecordStatus implements StringEnum<RecordStatus>{

    ACTIVE("A", "ACTIVE"),

    INACTIVE("I", "INACTIVE"),

    DELETE("D", "DELETE"),

    DEPRECATE("DP", "DEPRECATE"),

    ;

    private final String code;
    private final String description;

    public static RecordStatus getByCode(String code){
        return StringEnumReflectUtils.getByCode(RecordStatus.class, code);
    }
}
