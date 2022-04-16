package com.xuxinyu.bookRetail.dao;


import com.xuxinyu.bookRetail.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version V1.0
 * @Title: UserDao
 * @Package com.xuxinyu.bookRetail.dao
 * @Description: TODO
 * @author: runoob
 * @date: 2022-04-16 16:43
 */
@Repository
@Mapper
public interface UserDao {

    @Insert(value = { "INSERT INTO user (id, name, userType,point) VALUES (#{id}, #{name}, #{userType}, #{point})"})
    int  insertUser(User user);

    @Select("Select * from user")
    List<User> getUser();

    @Select("Select * from user where id = #{id}  limit 1")
    User getUserById(String id);

    @Update({"Update user set point=#{point} Where id=#{id} "})
    int  updateUser(User user);
}

