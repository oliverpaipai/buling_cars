package com.qf.controller;

import com.qf.pojo.Orders;
import com.qf.service.BackStageOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class BackStageOrdersController {
    @Autowired
    private BackStageOrdersService backStageOrdersService;
    @RequestMapping("/orderslist")
    public String selectAllOrders(Model model) {
        List<Orders> orders = backStageOrdersService.selectAllOrders();
        model.addAttribute("backorders",orders);
        return "BackStage";
    }
    @RequestMapping("/updateorder")
    public String updateOrders(Orders orders){
        backStageOrdersService.updateOrders(orders);
        return "redirect:/orders/orderslist";
    }
}
