package com.xuxinyu.bookRetail.controller;


import com.xuxinyu.bookRetail.common.CodeConstants;
import com.xuxinyu.bookRetail.common.OutputBean;
import com.xuxinyu.bookRetail.common.UserType;
import com.xuxinyu.bookRetail.entity.Order;
import com.xuxinyu.bookRetail.entity.User;
import com.xuxinyu.bookRetail.service.OrderService;
import com.xuxinyu.bookRetail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Title: OrderController
 * @Package com.xuxinyu.bookRetail.controller
 * @Description: TODO
 * @author: runoob
 * @date: 2022-04-16 13:32
 */
@RestController
@RequestMapping("/orderApi")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    /**
     *  新增订单
     * @param order
     * @return
     */
    @PostMapping("/order")
    @ResponseBody
    public OutputBean insert(@RequestBody Order order){
        OutputBean outputBean = new OutputBean();
        outputBean.setCode(CodeConstants.Basic.ZERO_CODE);
        outputBean.setMsg(CodeConstants.Basic.SUCCESS);

        if( null != order.getUserId()  && null != order.getPrice()){

            String userId = order.getUserId();
            User user = userService.getUserById(userId);
            //判断用户是否存在
            if (null == user){
                outputBean.setMsg("userId不存在!");
                outputBean.setCode(CodeConstants.Basic.STR_ONE);
                return outputBean;
            }
            String userType = user.getUserType();
            BigDecimal price = order.getPrice();
            BigDecimal point = user.getPoint();
            //本次新增的积分
            BigDecimal newPoint = new BigDecimal(0);

            //用户增加积分
            if (userType.equals(UserType.gold.getCode())){
               newPoint = price.multiply(new BigDecimal(3));
            }
            if (userType.equals(UserType.silver.getCode())){
               newPoint = price.multiply(new BigDecimal(2));
            }
            if (userType.equals(UserType.coper.getCode())){
               newPoint = price.multiply(new BigDecimal(1));
            }

            user.setPoint(point.add(newPoint));
            //更新用户积分
            userService.updateUser(user);

            orderService.addOrder(order);
            outputBean.setMsg(CodeConstants.Basic.SUCCESS_SAVE);
            return outputBean;
        }else {
            outputBean.setMsg("缺少参数");
            outputBean.setCode(CodeConstants.Basic.STR_ONE);
            return outputBean;
        }
    }

    /**
     * 查询所有订单
     * @return
     */
    @GetMapping("/order")
    public OutputBean queryAll(){
        OutputBean outputBean = new OutputBean();
        outputBean.setCode(CodeConstants.Basic.ZERO_CODE);
        outputBean.setMsg(CodeConstants.Basic.SUCCESS);
        List<Order> allOrder = orderService.getAllOrder();
        outputBean.setData(allOrder);
        outputBean.setCount(allOrder.size());
        return outputBean;
    }

    /**
     * 根据订单id查询订单
     * @return
     */
    @GetMapping("/order/{orderId}")
    public OutputBean queryOne(@PathVariable("orderId") String orderId){
        OutputBean outputBean = new OutputBean();
        outputBean.setCode(CodeConstants.Basic.ZERO_CODE);
        outputBean.setMsg(CodeConstants.Basic.SUCCESS);
        Map<String,Object> order = orderService.getOrderByOrderId(orderId);
        List<Map<String,Object>> orders = new ArrayList<>();
        if (null != order){
            orders.add(order);
            outputBean.setData(orders);
        }
        outputBean.setCount(orders.size());
        return outputBean;
    }

}
