package com.mouritech.ordermanagementsystem.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.ordermanagementsystem.model.Order;
import com.mouritech.ordermanagementsystem.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	

	@Autowired
	private OrderService ordService;
	/*
	 * public List<Order> orderList() { List<Order> orders = new ArrayList<Order>();
	 * orders.add(new Order(123,LocalDateTime.of(2021, 11, 11, 11,
	 * 11).toString(),568.23f)); orders.add(new Order(123,LocalDateTime.of(2021, 10,
	 * 11, 12, 10).toString(),678.23f)); orders.add(new
	 * Order(123,LocalDateTime.of(2021, 8, 1, 12, 10).toString(),578.23f)); return
	 * orders;
	 * 
	 * }
	 */

	//@RequestMapping(value = "/listorder", method = RequestMethod.GET)
	 @GetMapping("/listorder")
	  public String getUsers(Model model) throws Exception{
	    List<Order> ordersList = ordService.getAllOrders();
	    model.addAttribute("Orders", ordersList);
	    return "orderlist";
	  }
}
