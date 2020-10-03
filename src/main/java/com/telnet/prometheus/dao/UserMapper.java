package com.telnet.prometheus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.telnet.prometheus.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息持久层
 * @author Ternura
 * @since 2020/10/3 18:37
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
