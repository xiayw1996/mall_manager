package com.hd.mall_manager.bean;

import org.slf4j.Logger;

/**
 * @author xiayw
 * @date 2020年8月20日
 */
public enum ResultCode {

    operateSuccess(0, "操作成功"),
    operateFailed(1, "操作失败"),
    parameterFormatError(101,"参数格式错误"),
	paramNullException(102, "请确认必填字段"),
    fileNotExistException(104, "文件不能为空"),
    recordIsNull(107,"记录为空"),
    recordDuplicateException(201, "记录已存在"),
    fileTypeException(202,"文件类型错误"),
    obtainFileException(203,"导入文件失败"),
    closeDataStreamException(204,"关闭数据流出错！"),

    usernameOrPwdException(301, "登陆失败,用户名或密码错误"),
    accountBlockingException(302, "账号已停用"),
    adminOperationException(303,"不能更改管理员信息"),
    accountDoesNotExistException(304, "用户不存在"),
    accountDuplicateException(305, "用户已存在"),
    passwordNotUnanimousException(306,"密码输入错误"),
    passwordException(307,"新密码与旧密码一致，请重新设置密码"),
    adminOperationRoleException(308,"不能更改管理角色信息"),
    roleNameException(309, "角色名重复"),


    tokenException(999,"无效token"),;


    private String msg;
    private int code;

    private ResultCode(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DefineException getDE()  {
        return new DefineException(this.code,this.msg);
    }

    public DefineException getDE(Logger logger, Exception e)  {
        logger.error(this.code + "-" + this.msg, e);
        return new DefineException(this.code,this.msg);
    }

}
