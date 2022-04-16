package com.xuxinyu.bookRetail.controller;

import cn.hutool.core.util.StrUtil;
import com.xuxinyu.bookRetail.common.CodeConstants;
import com.xuxinyu.bookRetail.common.OutputBean;
import com.xuxinyu.bookRetail.common.UserType;
import com.xuxinyu.bookRetail.entity.User;
import com.xuxinyu.bookRetail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @Title: UserController
 * @Package com.xuxinyu.bookRetail.controller
 * @Description: TODO 用户管理controller
 * @author: runoob
 * @date: 2022-04-16 13:30
 */
@RestController
@RequestMapping("/userApi")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *  新增用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    @ResponseBody
    public OutputBean insert(@RequestBody User user){
        OutputBean outputBean = new OutputBean();
        outputBean.setCode(CodeConstants.Basic.ZERO_CODE);
        outputBean.setMsg(CodeConstants.Basic.SUCCESS);

        if(StrUtil.isNotBlank(user.getName())&&StrUtil.isNotBlank(user.getUserType())){

            if ( !user.getUserType().equals(UserType.gold.getCode()) && !user.getUserType().equals(UserType.coper.getCode())
                && !user.getUserType().equals(UserType.silver.getCode())){
                outputBean.setMsg("UserType参数不对");
                outputBean.setCode(CodeConstants.Basic.STR_ONE);
                return outputBean;
            }
            userService.addUser(user);
            outputBean.setMsg(CodeConstants.Basic.SUCCESS_SAVE);
            return outputBean;
        }else {
            outputBean.setMsg("缺少参数");
            outputBean.setCode(CodeConstants.Basic.STR_ONE);
            return outputBean;
        }
    }
}
