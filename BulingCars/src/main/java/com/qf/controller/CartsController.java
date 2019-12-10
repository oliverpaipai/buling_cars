package com.qf.controller;


import com.qf.pojo.Cars;
import com.qf.pojo.Carts;
import com.qf.pojo.Users;
import com.qf.service.CarService;
import com.qf.service.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/carts")
public class CartsController {


    @Autowired
    private CartsService cartsService;
    @Autowired
    private CarService carService;


    @RequestMapping("/addCarts")
    public void addCarts(HttpServletRequest request, Integer carid, Model model){
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        Integer userid = user.getId();
        Carts carts=new Carts();
        carts.setUserid(userid);
        carts.setCarid(carid);

        cartsService.insertCarts(carts);

    }


    @RequestMapping("/showCarts")
    public String showCarts(Model model){
        List<Carts> carts = cartsService.findCarts();
        for (Carts carts1:carts){
            Integer carid = carts1.getCarid();
            Cars cars = carService.findById(carid);
            model.addAttribute("cars",carid);
        }
        return "carts";
    }
}
