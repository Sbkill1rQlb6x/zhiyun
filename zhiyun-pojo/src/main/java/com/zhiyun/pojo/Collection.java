package com.zhiyun.pojo;

import java.io.Serializable;

public class Collection implements Serializable{
    private Integer collectId;

    private String cUserOnlyId;

    private Integer klId;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public String getcUserOnlyId() {
        return cUserOnlyId;
    }

    public void setcUserOnlyId(String cUserOnlyId) {
        this.cUserOnlyId = cUserOnlyId == null ? null : cUserOnlyId.trim();
    }

    public Integer getKlId() {
        return klId;
    }

    public void setKlId(Integer klId) {
        this.klId = klId;
    }
}