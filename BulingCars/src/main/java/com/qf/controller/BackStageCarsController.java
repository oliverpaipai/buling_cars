package com.qf.controller;

import com.qf.pojo.Cars;
import com.qf.service.BackStageCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class BackStageCarsController {
    @Autowired
    private BackStageCarsService backStageCarsService;

    @RequestMapping("/carlist")
    public String selectAllCars(Model model){
        List<Cars> cars = backStageCarsService.selectAllCars();
        model.addAttribute("backcars",cars);
        return "/BackStage.jsp";
    }
    @RequestMapping("/insertcar")
    public String insertCars(Cars cars){
        backStageCarsService.insertCars(cars);
        return "redirect:/cars/carlist";
    }
    @RequestMapping("/updatecar")
    public String updateCars(Cars cars){
        backStageCarsService.updateCars(cars);
        return "redirect:/cars/carlist";
    }
    @RequestMapping("/deletecar")
    public String deleteCars(Integer id){
        backStageCarsService.deleteCars(id);
        return "redirect:/cars/carlist";
    }
}
