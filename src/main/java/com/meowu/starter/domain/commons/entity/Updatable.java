package com.meowu.starter.domain.commons.entity;

import java.util.Date;

public interface Updatable{

    Date getUpdateTime();

    void setUpdateTime(Date updateTime);
}
