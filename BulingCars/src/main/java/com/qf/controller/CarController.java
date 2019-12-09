package com.qf.controller;

import com.qf.pojo.Cars;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/list")
    public String cars(Model model){
        List<Cars> cars = carService.selAllCars();
        for (Cars car:cars){
            if (car.getStatus().equals(0)){
                model.addAttribute("carlist",cars);
            }
        }

        return "carlist";
    }
@RequestMapping("/info")
    public String carInfo(Integer id,Model model){
        Cars cars = carService.selById(id);
        model.addAttribute("car",cars);
        return "carinfo";
    }
    @RequestMapping("/type")
    public String carType(Integer type,Model model){
        List<Cars> selType = carService.selType(type);
        model.addAttribute("car",selType);
        return "typecar";
    }

}
