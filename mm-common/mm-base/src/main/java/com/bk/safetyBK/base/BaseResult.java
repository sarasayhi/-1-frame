package com.bk.safetyBK.base;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = 6803323956728517039L;

    /**
     * 成功
     */
    public static final int SUCCESS_TYPE = 1;
    /**
     * 错误：系统内部已经处理
     */
    public static final int ERROR_TYPE = -1;
    /**
     * 失败：系统内部未处理
     */
    public static final int FAIL_TYPE = 0;

    private int type = FAIL_TYPE; //结果类型
    private String code; //处理结果业务代码
    private String msg; //处理结果业务信息
    private T data; //返回的数据

    /**
     * 无参构造函数
     */
    public BaseResult() {

    }

    /**
     * @param code 处理结果业务代码
     * @param msg 处理结果业务信息
     */
    public BaseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    /**
     * @param type 结果类型
     * @param code 处理结果业务代码
     * @param msg 处理结果业务信息
     */
    public BaseResult(int type, String code, String msg) {
        this.type = type;
        this.code = code;
        this.msg = msg;
    }

    /**
     * @param type 结果类型
     * @param code 处理结果业务代码
     * @param msg 处理结果业务信息
     * @param data 返回的数据
     */
    public BaseResult(int type, String code, String msg, T data) {
        this.type = type;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @return 结果类型
     */
    public int getType() {
        return type;
    }

    /**
     * @param type 结果类型
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return 结果数据
     */
    public T getData() {
        return data;
    }

    /**
     * @param data 结果数据
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return 处理结果业务代码
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code 处理结果业务代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 处理结果业务信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg 处理结果业务信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}