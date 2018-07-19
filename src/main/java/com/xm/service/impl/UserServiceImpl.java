package com.xm.service.impl;

import com.xm.pojo.User;
import com.xm.mapper.UserMapper;
import com.xm.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-07-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
