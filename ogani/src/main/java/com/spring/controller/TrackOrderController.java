package com.spring.controller;

import com.spring.model.Cart;
import com.spring.model.Checkout;
import com.spring.model.User;
import com.spring.service.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class TrackOrderController {
    @Autowired
    private CheckoutServiceImpl service;
    @RequestMapping(value = "/trackorder/{userid}", method = RequestMethod.GET)
    public ModelAndView trackOrder(HttpSession session){
        ModelAndView mv = new ModelAndView("user/trackorder");
        User loginInfo = (User) session.getAttribute("loginInfo");
        mv.addObject("trackorder", service.getOrder(loginInfo.getId()));
        return mv;
    }

}
