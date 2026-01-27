package com.meowu.starter.domain.commons.entity;

import java.util.Objects;

public abstract class Identity<T>{

    public abstract T getId();

    public abstract void setId(T id);

    @Override
    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }else if(Objects.nonNull(compare) && this.getClass() == compare.getClass()){
            Identity<?> that = (Identity<?>) compare;
            return Objects.equals(that.getId(), this.getId());
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.getId());
    }
}
