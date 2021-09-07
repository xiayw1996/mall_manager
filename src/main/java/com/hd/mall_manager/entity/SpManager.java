package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 管理员表
    */
public class SpManager implements Serializable {
    /**
    * 主键id
    */
    private Integer mgId;

    /**
    * 名称
    */
    private String mgName;

    /**
    * 密码
    */
    private String mgPwd;

    /**
    * 注册时间
    */
    private Integer mgTime;

    /**
    * 角色id
    */
    private Byte roleId;

    private String mgMobile;

    private String mgEmail;

    /**
    * 1：表示启用 0:表示禁用
    */
    private boolean mgState;

    private String roleName;
    private String mgTime1;

    private static final long serialVersionUID = 1L;

    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }

    public String getMgName() {
        return mgName;
    }

    public void setMgName(String mgName) {
        this.mgName = mgName;
    }

    public String getMgPwd() {
        return mgPwd;
    }

    public void setMgPwd(String mgPwd) {
        this.mgPwd = mgPwd;
    }

    public Integer getMgTime() {
        return mgTime;
    }

    public void setMgTime(Integer mgTime) {
        this.mgTime = mgTime;
    }

    public Byte getRoleId() {
        return roleId;
    }

    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    public String getMgMobile() {
        return mgMobile;
    }

    public void setMgMobile(String mgMobile) {
        this.mgMobile = mgMobile;
    }

    public String getMgEmail() {
        return mgEmail;
    }

    public void setMgEmail(String mgEmail) {
        this.mgEmail = mgEmail;
    }

    public boolean getMgState() {
        return mgState;
    }

    public void setMgState(boolean mgState) {
        this.mgState = mgState;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMgTime1() {
        return mgTime1;
    }

    public void setMgTime1(String mgTime1) {
        this.mgTime1 = mgTime1;
    }
}