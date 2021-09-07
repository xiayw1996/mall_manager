package com.hd.mall_manager.bean;

/**
 * @author xiayw
 * @date 2020年8月20日
 */
public class ResultVO<T> {
    /**
     * 状态码，比如0代表响应成功
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;
    /**
     * 响应的具体数据
     */
    private T data;

    public ResultVO(){
        this(ResultCode.operateSuccess);
    }

    public ResultVO(T data) {
        this(ResultCode.operateSuccess);
        this.data = data;
    }

    public ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(int code, String msg) {
        this(code, msg, null);
    }

    public ResultVO(ResultCode resultCode){
        this(resultCode.getCode(), resultCode.getMsg());
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }
}
