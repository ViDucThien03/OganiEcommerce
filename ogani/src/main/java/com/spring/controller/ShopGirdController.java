package com.spring.controller;

import com.spring.service.ProductServiceImpl;
import com.spring.service.ShopGirdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopGirdController {
    @Autowired
    private ShopGirdServiceImpl girdService;
    @Autowired
    private ProductServiceImpl productService;
    @RequestMapping(value = "/shop-gird", method = RequestMethod.GET)
    public ModelAndView shopGird(){
        ModelAndView mv = new ModelAndView("user/shopgird");
        mv.addObject("allproduct",girdService.getAllProduct());
        mv.addObject("lastestproduct",girdService.getLastestProduct());
        mv.addObject("saleproduct",girdService.getSaleProduct());
        mv.addObject("category", productService.getDataCategory());
        return mv;
    }
}
