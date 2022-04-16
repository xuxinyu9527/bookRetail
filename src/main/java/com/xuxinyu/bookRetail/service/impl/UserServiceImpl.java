package com.xuxinyu.bookRetail.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.xuxinyu.bookRetail.common.UserType;
import com.xuxinyu.bookRetail.dao.UserDao;
import com.xuxinyu.bookRetail.entity.User;
import com.xuxinyu.bookRetail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @version V1.0
 * @Title: UserServiceImpl
 * @Package com.xuxinyu.bookRetail.service.impl
 * @Description: TODO 用户管理service实现类
 * @author: runoob
 * @date: 2022-04-16 12:14
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        user.setId(UUID.fastUUID().toString());
        user.setPoint(new BigDecimal(0));
        return userDao.insertUser(user);
    }

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getUser();
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

}
