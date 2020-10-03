package com.telnet.prometheus.base;

import com.telnet.prometheus.constant.HttpConstant;
import com.telnet.prometheus.em.ResultErrorEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * http restful接口返回结果
 * @author Ternura
 * @since 2020/10/3 19:50
 */
@Data
public class RestfulResult<T> implements Serializable {
    /**
     * 错误码
     */
    private int status;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 返回结果
     */
    private T data;

    /**
     * 成功返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RestfulResult<T> ok(T data) {
        RestfulResult<T> result = new RestfulResult<>();
        result.status = HttpConstant.RESTFUL_SUCCESS_CODE;
        result.data = data;

        return result;
    }

    /**
     * 失败返回
     * @param errorEnum
     * @param <T>
     * @return
     */
    public static <T> RestfulResult<T> error(ResultErrorEnum errorEnum) {
        RestfulResult<T> result = new RestfulResult<>();
        if (errorEnum == null) {
            errorEnum = ResultErrorEnum.UNKNOWN_ERROR;
        }
        result.status = errorEnum.getStatus();
        result.msg = errorEnum.getMessage();

        return result;
    }
}
