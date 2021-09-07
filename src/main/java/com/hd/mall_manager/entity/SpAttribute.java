package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 属性表
    */
public class SpAttribute implements Serializable {
    /**
    * 主键id
    */
    private Short attrId;

    /**
    * 属性名称
    */
    private String attrName;

    /**
    * 外键，类型id
    */
    private Short catId;

    /**
    * only:输入框(唯一)  many:后台下拉列表/前台单选框
    */
    private Object attrSel;

    /**
    * manual:手工录入  list:从列表选择
    */
    private Object attrWrite;

    /**
    * 可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
    */
    private String attrVals;

    /**
    * 删除时间标志
    */
    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public Object getAttrSel() {
        return attrSel;
    }

    public void setAttrSel(Object attrSel) {
        this.attrSel = attrSel;
    }

    public Object getAttrWrite() {
        return attrWrite;
    }

    public void setAttrWrite(Object attrWrite) {
        this.attrWrite = attrWrite;
    }

    public String getAttrVals() {
        return attrVals;
    }

    public void setAttrVals(String attrVals) {
        this.attrVals = attrVals;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }
}