package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SpReport3 implements Serializable {
    private Integer id;

    /**
    * 用户来源
    */
    private String rp3Src;

    /**
    * 数量
    */
    private Integer rp3Count;

    private LocalDateTime rp3Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp3Src() {
        return rp3Src;
    }

    public void setRp3Src(String rp3Src) {
        this.rp3Src = rp3Src;
    }

    public Integer getRp3Count() {
        return rp3Count;
    }

    public void setRp3Count(Integer rp3Count) {
        this.rp3Count = rp3Count;
    }

    public LocalDateTime getRp3Date() {
        return rp3Date;
    }

    public void setRp3Date(LocalDateTime rp3Date) {
        this.rp3Date = rp3Date;
    }
}