package com.hd.mall_manager.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SpUserCart implements Serializable {
    /**
    * 主键
    */
    private Integer cartId;

    /**
    * 学员id
    */
    private Integer userId;

    /**
    * 购物车详情信息，二维数组序列化信息
    */
    private String cartInfo;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCartInfo() {
        return cartInfo;
    }

    public void setCartInfo(String cartInfo) {
        this.cartInfo = cartInfo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }
}