package com.hd.mall_manager.bean;

import java.util.List;

/**
 * @author xiayw
 * @date 2020年8月20日
 */
public class PageData<T> {
    /**
	 * 数据总量
	 */
	private Integer recordsTotal;
    /**
     * 起始数据下标
     */
    private Integer start;
    /**
     * 单页数据量
     */
    private Integer length;
    /**
     * 数据
     */
    private List<T> pageData;

    private String draw;
    /**
     * 状态码，比如0代表响应成功
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;

    public PageData(){
        this(ResultCode.operateSuccess);
        this.start = 0;
        this.length = 10;
        this.recordsTotal = 0;
        this.pageData = null;
    }

    public PageData(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
