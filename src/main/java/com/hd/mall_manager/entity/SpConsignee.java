package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 收货人表
    */
public class SpConsignee implements Serializable {
    /**
    * 主键id
    */
    private Integer cgnId;

    /**
    * 会员id
    */
    private Integer userId;

    /**
    * 收货人名称
    */
    private String cgnName;

    /**
    * 收货人地址
    */
    private String cgnAddress;

    /**
    * 收货人电话
    */
    private String cgnTel;

    /**
    * 邮编
    */
    private String cgnCode;

    /**
    * 删除时间
    */
    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getCgnId() {
        return cgnId;
    }

    public void setCgnId(Integer cgnId) {
        this.cgnId = cgnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCgnName() {
        return cgnName;
    }

    public void setCgnName(String cgnName) {
        this.cgnName = cgnName;
    }

    public String getCgnAddress() {
        return cgnAddress;
    }

    public void setCgnAddress(String cgnAddress) {
        this.cgnAddress = cgnAddress;
    }

    public String getCgnTel() {
        return cgnTel;
    }

    public void setCgnTel(String cgnTel) {
        this.cgnTel = cgnTel;
    }

    public String getCgnCode() {
        return cgnCode;
    }

    public void setCgnCode(String cgnCode) {
        this.cgnCode = cgnCode;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }
}