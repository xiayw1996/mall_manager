package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 权限表
    */
public class SpPermission implements Serializable {
    private Short psId;

    /**
    * 权限名称
    */
    private String psName;

    /**
    * 父id
    */
    private Short psPid;

    /**
    * 控制器
    */
    private String psC;

    /**
    * 操作方法
    */
    private String psA;

    /**
    * 权限等级
    */
    private Object psLevel;

    private String psApiPath;

    private static final long serialVersionUID = 1L;

    public Short getPsId() {
        return psId;
    }

    public void setPsId(Short psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public Short getPsPid() {
        return psPid;
    }

    public void setPsPid(Short psPid) {
        this.psPid = psPid;
    }

    public String getPsC() {
        return psC;
    }

    public void setPsC(String psC) {
        this.psC = psC;
    }

    public String getPsA() {
        return psA;
    }

    public void setPsA(String psA) {
        this.psA = psA;
    }

    public Object getPsLevel() {
        return psLevel;
    }

    public void setPsLevel(Object psLevel) {
        this.psLevel = psLevel;
    }

    public String getPsApiPath() {
        return psApiPath;
    }

    public void setPsApiPath(String psApiPath) {
        this.psApiPath = psApiPath;
    }
}