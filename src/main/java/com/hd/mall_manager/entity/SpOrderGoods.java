package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
    * 商品订单关联表
    */
public class SpOrderGoods implements Serializable {
    /**
    * 主键id
    */
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 商品单价
    */
    private BigDecimal goodsPrice;

    /**
    * 购买单个商品数量
    */
    private Byte goodsNumber;

    /**
    * 商品小计价格
    */
    private BigDecimal goodsTotalPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Byte getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Byte goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }
}