package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
    * 商品-属性关联表
    */
public class SpGoodsAttr implements Serializable {
    /**
    * 主键id
    */
    private Integer id;

    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 属性id
    */
    private Short attrId;

    /**
    * 商品对应属性的值
    */
    private String attrValue;

    /**
    * 该属性需要额外增加的价钱
    */
    private BigDecimal addPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public BigDecimal getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(BigDecimal addPrice) {
        this.addPrice = addPrice;
    }
}