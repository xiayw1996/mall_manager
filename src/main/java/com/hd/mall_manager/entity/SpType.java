package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 类型表
    */
public class SpType implements Serializable {
    /**
    * 主键id
    */
    private Short typeId;

    /**
    * 类型名称
    */
    private String typeName;

    /**
    * 删除时间标志
    */
    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Short getTypeId() {
        return typeId;
    }

    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }
}