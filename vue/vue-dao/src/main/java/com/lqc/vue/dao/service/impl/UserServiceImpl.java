package com.lqc.vue.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lqc.vue.dao.dao.UserDao;
import com.lqc.vue.dao.entity.User;
import com.lqc.vue.dao.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2021-10-27 22:03:46
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

