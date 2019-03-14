package com.zhiyun.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

public class Knowledge implements Serializable{
	@Field
    private Integer id;

    @Field("kw_title")
    private String klTitle;

    private Integer klType;

    private Integer klCollectCount;

    private Integer klRemark;

    private String userOnlyId;

    @Field("kw_date")
    private Date klDate;

    @Field("kw_author")
    private String klAuthor;

    @Field("kw_userface")
    private String userFace;

    private Integer isshared;

    @Field("kw_content")
    private String klContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKlTitle() {
        return klTitle;
    }

    public void setKlTitle(String klTitle) {
        this.klTitle = klTitle == null ? null : klTitle.trim();
    }

    public Integer getKlType() {
        return klType;
    }

    public void setKlType(Integer klType) {
        this.klType = klType;
    }

    public Integer getKlCollectCount() {
        return klCollectCount;
    }

    public void setKlCollectCount(Integer klCollectCount) {
        this.klCollectCount = klCollectCount;
    }

    public Integer getKlRemark() {
        return klRemark;
    }

    public void setKlRemark(Integer klRemark) {
        this.klRemark = klRemark;
    }

    public String getUserOnlyId() {
        return userOnlyId;
    }

    public void setUserOnlyId(String userOnlyId) {
        this.userOnlyId = userOnlyId == null ? null : userOnlyId.trim();
    }

    public Date getKlDate() {
        return klDate;
    }

    public void setKlDate(Date klDate) {
        this.klDate = klDate;
    }

    public String getKlAuthor() {
        return klAuthor;
    }

    public void setKlAuthor(String klAuthor) {
        this.klAuthor = klAuthor == null ? null : klAuthor.trim();
    }

    public String getUserFace() {
        return userFace;
    }

    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }

    public Integer getIsshared() {
        return isshared;
    }

    public void setIsshared(Integer isshared) {
        this.isshared = isshared;
    }

    public String getKlContent() {
        return klContent;
    }

    public void setKlContent(String klContent) {
        this.klContent = klContent == null ? null : klContent.trim();
    }
}