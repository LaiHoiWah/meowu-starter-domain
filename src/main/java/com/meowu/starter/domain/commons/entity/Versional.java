package com.meowu.starter.domain.commons.entity;

public interface Versional<V>{

    V getVersion();

    void setVersion(V version);
}
