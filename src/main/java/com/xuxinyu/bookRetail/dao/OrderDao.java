package com.xuxinyu.bookRetail.dao;

import com.xuxinyu.bookRetail.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * @version V1.0
 * @Title: OrderMapper
 * @Package com.xuxinyu.bookRetail.dao
 * @Description: TODO
 * @author: runoob
 * @date: 2022-04-16 16:50
 */
@Repository
@Mapper
public interface OrderDao {

    @Insert(value = { "INSERT INTO `order` (id, userId, price) VALUES (#{id}, #{userId}, #{price})"})
    int insertOrder(Order order);

    @Select("Select * from `order` ")
    List<Order> getOrder();

    @Select("Select o.*, u.name as userName  from `order` o  left join user u on u.id = o.userId  where o.id = #{orderId}  limit 1")
    Map<String,Object> getOrderById(String orderId);
}
