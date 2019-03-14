package com.zhiyun.pojo;

import java.io.Serializable;

public class KlType implements Serializable{
    private Integer klCode;

    private String klName;

    public Integer getKlCode() {
        return klCode;
    }

    public void setKlCode(Integer klCode) {
        this.klCode = klCode;
    }

    public String getKlName() {
        return klName;
    }

    public void setKlName(String klName) {
        this.klName = klName == null ? null : klName.trim();
    }
}