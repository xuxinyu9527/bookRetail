package com.xuxinyu.bookRetail.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version V1.0
 * @Title: OutputBean
 * @Package com.xuxinyu.bookRetail.common
 * @Description: TODO 通用返回对象
 * @author: runoob
 * @date: 2022-04-16 13:34
 */
@Data
public class OutputBean implements Serializable {
    private static final long serialVersionUID = -5513380482098539879L;

    private String code;

    private String msg;

    private int count;

    private List<?> data;

    private Object dataObject;
}
