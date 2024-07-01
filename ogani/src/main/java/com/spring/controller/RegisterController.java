package com.spring.controller;

import com.spring.model.User;
import com.spring.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("user/account/register");
        mv.addObject("user", new User());
        return mv;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView createAccount(@ModelAttribute("c") User user){
        ModelAndView mv = new ModelAndView();
        int count = accountService.addAccount(user);
        if(count > 0){
            mv.addObject("status","Đăng ký thành công!");
        } else {
            mv.addObject("status","Đăng ký thất bại");
        }

        mv.setViewName("user/account/register");
        return mv;
    }

}
