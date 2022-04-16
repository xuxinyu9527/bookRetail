package com.xuxinyu.bookRetail;

import com.xuxinyu.bookRetail.entity.Order;
import com.xuxinyu.bookRetail.entity.User;
import com.xuxinyu.bookRetail.service.OrderService;
import com.xuxinyu.bookRetail.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.List;

@ActiveProfiles("dev")
@SpringBootTest
class BookRetailApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;

	@Test
	void contextLoads() {
	}
	
	@Test
	@DisplayName("用户service:测试新增一个用户")
	void addOneUser() {
		User UserOne = new User();
		UserOne.setId("111");
		UserOne.setName("用户111");
		UserOne.setUserType("1");
		UserOne.setPoint(new BigDecimal(15));

		int i = userService.addUser(UserOne);
		System.out.println(i);
	}

	@Test
	@DisplayName("订单service:测试新增订单")
	void addOneOrder() {
		Order order = new Order();
		order.setId("111");
		order.setUserId("1");
		order.setPrice(new BigDecimal(15));
		int i = orderService.addOrder(order);
		System.out.println(i);
	}
	@Test
	@DisplayName("订单service:测试查询订单")
	void queryOrder() {
		List<Order> allOrder = orderService.getAllOrder();
		System.out.println(allOrder);
	}

}
