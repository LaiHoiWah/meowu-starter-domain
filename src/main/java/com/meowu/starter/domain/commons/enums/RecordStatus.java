package com.meowu.starter.domain.commons.enums;

import com.meowu.starter.domain.commons.utils.IntEnumReflectUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum RecordStatus implements IntEnum<RecordStatus>{

    ACTIVE(0, "ACTIVE"),

    INACTIVE(1, "INACTIVE"),

    DELETE(2, "DELETE"),

    DEPRECATE(3, "DEPRECATE"),

    ;

    private final Integer code;
    private final String  description;

    public static RecordStatus getByCode(Integer code){
        return IntEnumReflectUtils.getByCode(RecordStatus.class, code);
    }
}
