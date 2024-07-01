package com.spring.controller;

import com.spring.dao.HomeDao;
import com.spring.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    ProductServiceImpl productService;

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public ModelAndView Home(){
        ModelAndView mv = new ModelAndView("user/home");
        mv.addObject("category", productService.getDataCategory());
        mv.addObject("product", productService.getFeaturedProduct());
        return mv;
    }
}
