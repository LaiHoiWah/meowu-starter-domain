package com.meowu.starter.domain.commons.entity;

import java.util.Date;

public interface Deletable{

    Date getDeleteTime();

    void setDeleteTime(Date deleteTime);
}
