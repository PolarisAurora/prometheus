package com.telnet.prometheus.em;

/**
 * 返回结果错误码枚举类
 * @author Ternura
 * @since 2020/10/3 19:56
 */
public enum ResultErrorEnum {
    /**
     * 默认未知异常
     */
    UNKNOWN_ERROR(501, "未知异常，请稍后重试");

    private int status;

    private String msg;

    ResultErrorEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
