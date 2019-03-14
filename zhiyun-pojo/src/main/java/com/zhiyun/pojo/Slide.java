package com.zhiyun.pojo;

import java.io.Serializable;

public class Slide implements Serializable{
    private Integer sId;

    private String sPath;

    private Integer sOrder;

    private String sImgId;

    private String sInputId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsPath() {
        return sPath;
    }

    public void setsPath(String sPath) {
        this.sPath = sPath == null ? null : sPath.trim();
    }

    public Integer getsOrder() {
        return sOrder;
    }

    public void setsOrder(Integer sOrder) {
        this.sOrder = sOrder;
    }

    public String getsImgId() {
        return sImgId;
    }

    public void setsImgId(String sImgId) {
        this.sImgId = sImgId == null ? null : sImgId.trim();
    }

    public String getsInputId() {
        return sInputId;
    }

    public void setsInputId(String sInputId) {
        this.sInputId = sInputId == null ? null : sInputId.trim();
    }
}