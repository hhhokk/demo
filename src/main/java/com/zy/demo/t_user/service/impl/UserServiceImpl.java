package com.zy.demo.t_user.service.impl;

import com.zy.demo.t_user.entity.User;
import com.zy.demo.t_user.mapper.UserMapper;
import com.zy.demo.t_user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2022-02-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
