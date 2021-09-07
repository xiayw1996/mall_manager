package com.hd.mall_manager.entity;

import java.io.Serializable;

public class SpGoodsCats implements Serializable {
    /**
    * 分类id
    */
    private Integer catId;

    /**
    * 父级id
    */
    private Integer parentId;

    /**
    * 分类名称
    */
    private String catName;

    /**
    * 是否显示
    */
    private Byte isShow;

    /**
    * 分类排序
    */
    private Integer catSort;

    /**
    * 数据标记
    */
    private Byte dataFlag;

    /**
    * 创建时间
    */
    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Integer getCatSort() {
        return catSort;
    }

    public void setCatSort(Integer catSort) {
        this.catSort = catSort;
    }

    public Byte getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Byte dataFlag) {
        this.dataFlag = dataFlag;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}