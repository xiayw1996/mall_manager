package com.hd.mall_manager.entity;

import java.io.Serializable;

/**
    * 商品-相册关联表
    */
public class SpGoodsPics implements Serializable {
    /**
    * 主键id
    */
    private Integer picsId;

    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 相册大图800*800
    */
    private String picsBig;

    /**
    * 相册中图350*350
    */
    private String picsMid;

    /**
    * 相册小图50*50
    */
    private String picsSma;

    private static final long serialVersionUID = 1L;

    public Integer getPicsId() {
        return picsId;
    }

    public void setPicsId(Integer picsId) {
        this.picsId = picsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPicsBig() {
        return picsBig;
    }

    public void setPicsBig(String picsBig) {
        this.picsBig = picsBig;
    }

    public String getPicsMid() {
        return picsMid;
    }

    public void setPicsMid(String picsMid) {
        this.picsMid = picsMid;
    }

    public String getPicsSma() {
        return picsSma;
    }

    public void setPicsSma(String picsSma) {
        this.picsSma = picsSma;
    }
}