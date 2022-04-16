package com.xuxinyu.bookRetail.service;

import com.xuxinyu.bookRetail.entity.Order;
import com.xuxinyu.bookRetail.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: UserService
 * @Package com.xuxinyu.bookRetail.service
 * @Description: TODO 用户管理service
 * @author: runoob
 * @date: 2022-04-16 12:11    
 * @version V1.0
 */
public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int addUser(User user);

    User getUserById(String id);

    List<User> getAllUser();

    int updateUser(User user);
}
