package com.bk.safetyBK.base;

public enum CommonErrorCode {

    /**
     * 参数错误
     */
    PARAMETER_ILLEGAL("0000000001", "Parameter Illegal!"),
    /**
     * 系统内部异常
     */
    SYSTEM_INTERNAL_ERROR("0000000002", "System Internal Error"),

    /**
     * 未定义异常
     */
    UNKNOWN_ERROR("0000000003", "Unknown Error");

    private String code;
    private String msg;

    CommonErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * @return 错误码
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code 错误码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 错误信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg 错误信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}