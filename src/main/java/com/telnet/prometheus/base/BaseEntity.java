package com.telnet.prometheus.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础对象信息
 * @author Ternura
 * @since 2020/10/3 9:46
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;
}
