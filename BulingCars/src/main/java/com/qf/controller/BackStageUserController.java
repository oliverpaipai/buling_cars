package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.BackStageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class BackStageUserController {
    @Autowired
    private BackStageUserService backStageService;

    //获取所有用户
    @RequestMapping("/userlist")
    public String Users(Model model){
        List<Users> users = backStageService.selectAllUsers();
        model.addAttribute("backusers",users);
        return "backStageSy";
    }
    //修改用户
    @RequestMapping("/updateuser")
    public String updateUser(Users users) {
        backStageService.updateUsers(users);
        return "redirect:/users/userlist";
    }
    //删除用户
    @RequestMapping("/deleteuser")
    public String deleteUser(Integer id){
        backStageService.deleteUsers(id);
        return "redirect:/users/userlist";
    }
}
