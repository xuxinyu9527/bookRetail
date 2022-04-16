package com.xuxinyu.bookRetail.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Title: User
 * @Package com.xuxinyu.bookRetail.entity
 * @Description: TODO 订单表
 * @author: runoob
 * @date: 2022-04-16 11:50
 * @version V1.0
 */
@Data
public class Order implements Serializable {

    /**
     * 订单id
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 订单金额
     */
    private BigDecimal price;

}
