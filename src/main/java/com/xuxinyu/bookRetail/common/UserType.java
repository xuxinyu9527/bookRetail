package com.xuxinyu.bookRetail.common;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 用户类型枚举类
 * @author: runoob
 * @date:
 */
public enum UserType {
    gold("1","gold"),
    silver("2","silver"),
    coper("3","coper");
    private String code;
    private String type;

    UserType(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
