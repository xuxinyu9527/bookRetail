package com.xuxinyu.bookRetail.service.impl;

import cn.hutool.core.lang.UUID;
import com.xuxinyu.bookRetail.dao.OrderDao;
import com.xuxinyu.bookRetail.entity.Order;
import com.xuxinyu.bookRetail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Title: OrderServiceImpl
 * @Package com.xuxinyu.bookRetail.service.impl
 * @Description: TODO 订单管理service实现类
 * @author: runoob
 * @date: 2022-04-16 13:29
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public int addOrder(Order order) {
        order.setId(UUID.randomUUID().toString());
        return orderDao.insertOrder(order);
    }

    @Override
    public Map<String,Object> getOrderByOrderId(String orderId) {
        return orderDao.getOrderById(orderId);
    }

    @Override
    public List<Order> getAllOrder() {
        return  orderDao.getOrder();
    }
}
