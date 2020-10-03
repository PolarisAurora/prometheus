package com.telnet.prometheus.em;

import com.telnet.prometheus.util.SpringBeanUtils;

/**
 * 返回结果错误码枚举类
 * @author Ternura
 * @since 2020/10/3 19:56
 */
public enum ResultErrorEnum {
    /**
     * 默认未知异常
     */
    UNKNOWN_ERROR(501, "unknown-exception-message");

    private int status;

    private String messageKey;

    ResultErrorEnum(int status, String messageKey) {
        this.status = status;
        this.messageKey = messageKey;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return SpringBeanUtils.getMessageByDefaultLocale(messageKey);
    }
}
