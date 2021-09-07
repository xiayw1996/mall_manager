package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class SpReport1 implements Serializable {
    private Integer id;

    /**
    * 用户数
    */
    private Integer rp1UserCount;

    /**
    * 地区
    */
    private String rp1Area;

    private LocalDate rp1Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRp1UserCount() {
        return rp1UserCount;
    }

    public void setRp1UserCount(Integer rp1UserCount) {
        this.rp1UserCount = rp1UserCount;
    }

    public String getRp1Area() {
        return rp1Area;
    }

    public void setRp1Area(String rp1Area) {
        this.rp1Area = rp1Area;
    }

    public LocalDate getRp1Date() {
        return rp1Date;
    }

    public void setRp1Date(LocalDate rp1Date) {
        this.rp1Date = rp1Date;
    }
}