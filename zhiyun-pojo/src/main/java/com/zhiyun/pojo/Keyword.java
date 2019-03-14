package com.zhiyun.pojo;

import java.io.Serializable;

public class Keyword implements Serializable{
    private Integer kId;

    private String kContent;

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkContent() {
        return kContent;
    }

    public void setkContent(String kContent) {
        this.kContent = kContent == null ? null : kContent.trim();
    }
}