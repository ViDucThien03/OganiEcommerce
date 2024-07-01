package com.spring.controller;

import com.spring.service.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TrackOrderDetailController {
    @Autowired
    private CheckoutServiceImpl  service;
    @RequestMapping(value = "/trackorderdetail/{checkoutid}", method = RequestMethod.GET)
    public ModelAndView trackOrderDetail(@PathVariable int checkoutid){
        ModelAndView mv = new ModelAndView("user/trackorderdetail");
        mv.addObject("orderdetail",service.getOrderDetail(checkoutid));
        return mv;
    }
}
