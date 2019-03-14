package com.zhiyun.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private Integer userId;

    private String userPhone;

    private String email;

    private String userPass;

    private Integer userRemark;

    private Integer userFlag;

    private String nickname;

    private String userFace;

    private String userOnlyid;

    private Integer userShareCount;

    private Integer userCollectCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public Integer getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(Integer userRemark) {
        this.userRemark = userRemark;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserFace() {
        return userFace;
    }

    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }

    public String getUserOnlyid() {
        return userOnlyid;
    }

    public void setUserOnlyid(String userOnlyid) {
        this.userOnlyid = userOnlyid == null ? null : userOnlyid.trim();
    }

    public Integer getUserShareCount() {
        return userShareCount;
    }

    public void setUserShareCount(Integer userShareCount) {
        this.userShareCount = userShareCount;
    }

    public Integer getUserCollectCount() {
        return userCollectCount;
    }

    public void setUserCollectCount(Integer userCollectCount) {
        this.userCollectCount = userCollectCount;
    }
}