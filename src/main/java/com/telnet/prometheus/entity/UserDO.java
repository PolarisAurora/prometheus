package com.telnet.prometheus.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.telnet.prometheus.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 用户信息持久对象
 * @author Ternura
 * @since 2020/10/3 9:44
 */
@Data
public class UserDO extends BaseEntity {
    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户手机号码
     */
    private String mobile;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户签名
     */
    private String signature;

    /**
     * 用户性别
     */
    private Short sex;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户状态
     */
    @TableLogic
    private Short status;

    /**
     * 出生日期
     */
    private Date birthday;

}
