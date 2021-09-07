package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class SpReport2 implements Serializable {
    private Integer id;

    private String rp2Page;

    private Integer rp2Count;

    private LocalDate rp2Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp2Page() {
        return rp2Page;
    }

    public void setRp2Page(String rp2Page) {
        this.rp2Page = rp2Page;
    }

    public Integer getRp2Count() {
        return rp2Count;
    }

    public void setRp2Count(Integer rp2Count) {
        this.rp2Count = rp2Count;
    }

    public LocalDate getRp2Date() {
        return rp2Date;
    }

    public void setRp2Date(LocalDate rp2Date) {
        this.rp2Date = rp2Date;
    }
}