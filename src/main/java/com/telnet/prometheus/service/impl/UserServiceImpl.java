package com.telnet.prometheus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.telnet.prometheus.dao.UserMapper;
import com.telnet.prometheus.entity.UserDO;
import com.telnet.prometheus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Ternura
 * @since 2020/10/3 19:46
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
}
