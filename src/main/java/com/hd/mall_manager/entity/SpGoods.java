package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
    * 商品表
    */
public class SpGoods implements Serializable {
    /**
    * 主键id
    */
    private Integer goodsId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 商品价格
    */
    private BigDecimal goodsPrice;

    /**
    * 商品数量
    */
    private Integer goodsNumber;

    /**
    * 商品重量
    */
    private Short goodsWeight;

    /**
    * 类型id
    */
    private Short catId;

    /**
    * 商品详情介绍
    */
    private String goodsIntroduce;

    /**
    * 图片logo大图
    */
    private String goodsBigLogo;

    /**
    * 图片logo小图
    */
    private String goodsSmallLogo;

    /**
    * 0:正常  1:删除
    */
    private Object isDel;

    /**
    * 添加商品时间
    */
    private Integer addTime;

    /**
    * 修改商品时间
    */
    private Integer updTime;

    /**
    * 软删除标志字段
    */
    private Integer deleteTime;

    /**
    * 一级分类id
    */
    private Short catOneId;

    /**
    * 二级分类id
    */
    private Short catTwoId;

    /**
    * 三级分类id
    */
    private Short catThreeId;

    /**
    * 热卖数量
    */
    private Integer hotMumber;

    /**
    * 是否促销
    */
    private Short isPromote;

    /**
    * 商品状态 0: 未通过 1: 审核中 2: 已审核
    */
    private Integer goodsState;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Short getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Short goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public String getGoodsBigLogo() {
        return goodsBigLogo;
    }

    public void setGoodsBigLogo(String goodsBigLogo) {
        this.goodsBigLogo = goodsBigLogo;
    }

    public String getGoodsSmallLogo() {
        return goodsSmallLogo;
    }

    public void setGoodsSmallLogo(String goodsSmallLogo) {
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public Object getIsDel() {
        return isDel;
    }

    public void setIsDel(Object isDel) {
        this.isDel = isDel;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Integer updTime) {
        this.updTime = updTime;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Short getCatOneId() {
        return catOneId;
    }

    public void setCatOneId(Short catOneId) {
        this.catOneId = catOneId;
    }

    public Short getCatTwoId() {
        return catTwoId;
    }

    public void setCatTwoId(Short catTwoId) {
        this.catTwoId = catTwoId;
    }

    public Short getCatThreeId() {
        return catThreeId;
    }

    public void setCatThreeId(Short catThreeId) {
        this.catThreeId = catThreeId;
    }

    public Integer getHotMumber() {
        return hotMumber;
    }

    public void setHotMumber(Integer hotMumber) {
        this.hotMumber = hotMumber;
    }

    public Short getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Short isPromote) {
        this.isPromote = isPromote;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }
}