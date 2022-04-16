package com.xuxinyu.bookRetail.service;

import com.xuxinyu.bookRetail.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Title: OrderService
 * @Package com.xuxinyu.bookRetail.service
 * @Description: TODO 订单管理service
 * @author: runoob
 * @date: 2022-04-16 12:16
 */
public interface OrderService {

    /**
     *  新增订单
     * @param order
     * @return
     */
    int addOrder(Order order);

    /**
     *  查询订单
     * @param orderId
     * @return
     */
    Map<String,Object> getOrderByOrderId(String orderId);

    List<Order> getAllOrder();
}
