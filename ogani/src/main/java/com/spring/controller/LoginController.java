package com.spring.controller;

import com.spring.model.Cart;
import com.spring.model.User;
import com.spring.service.AccountServiceImpl;
import com.spring.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private AccountServiceImpl accountService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("user/account/login");
        mv.addObject("user", new User());
        return mv;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(HttpSession session, @ModelAttribute("user") User user){
        ModelAndView mv = new ModelAndView();
        user = accountService.checkAccount(user);
        if(user != null){
            mv.setViewName("redirect:/home");
            session.setAttribute("loginInfo", user);

        } else {
            mv.addObject("statuslogin","Tài khoản hoặc mật khẩu không đúng");
            mv.setViewName("redirect:/login");

        }

        return mv;
    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletRequest request){

        session.removeAttribute("loginInfo");

        return "redirect:"+request.getHeader("Referer");
    }
}
