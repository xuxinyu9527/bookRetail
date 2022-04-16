package com.xuxinyu.bookRetail.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Title: User
 * @Package com.xuxinyu.bookRetail.entity
 * @Description: TODO 用户表
 * @author: runoob
 * @date: 2022-04-16 11:50    
 * @version V1.0
 */
@Data
public class User implements Serializable {

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户类型 gold,silver,coper
     */
    private String userType;

    /**
     * 用户积分
     */
    private BigDecimal point;
}
