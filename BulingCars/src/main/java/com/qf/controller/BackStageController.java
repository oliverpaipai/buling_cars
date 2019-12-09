package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.BackStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class BackStageController {
    @Autowired
    private BackStageService backStageService;

    //获取所有用户
    @RequestMapping("/userlist")
    public String Users(Model model){
        List<Users> users = backStageService.selectAllUsers();
        model.addAttribute("backuser",users);
        return "backuser";
    }
    //修改用户
    @RequestMapping("/updateuser")
    public String updateUser(Users users) {
        backStageService.updateUsers(users);
        return "redirect:/users/userlist";
    }
}
