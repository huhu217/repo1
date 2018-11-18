package com.hs.web;

import com.hs.domain.User;
import com.hs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(Model model){
        User user = userService.findById(41);
        model.addAttribute("item",user);
        return "itemDetail";
    }

}
