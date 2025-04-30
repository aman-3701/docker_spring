package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerPage {
    @Autowired
    private userService userService;

    @RequestMapping("/login")
    public String index(){
        return "login";
    }

    @GetMapping("/signup")
    public String showSignUp(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user")User user,Model model){
        if(userService.userExits(user.getName())){
            model.addAttribute("error","User already exists");
            return "signup";
        }
        userService.save(user);
        return "redirect:/login";
    }
}

