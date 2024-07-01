package com.spring.controller;

import com.spring.service.ProductDetailServiceImpl;
import com.spring.service.ProductServiceImpl;
import com.spring.service.ProductbyCateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopDetailController {
    @Autowired
    private ProductDetailServiceImpl detailService;
    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private ProductbyCateServiceImpl productbyCateService;



    @RequestMapping(value = "/shop-detail/{producid}", method = RequestMethod.GET)
    public ModelAndView shopDetail(@PathVariable int producid){
        ModelAndView mv = new ModelAndView("user/shopdetail");
        mv.addObject("producid", producid);
        mv.addObject("productdetail", detailService.getProductDetail(producid));
        mv.addObject("category", productService.getDataCategory());
        int id = detailService.getProductDetail(producid).getCategoryid();
        mv.addObject("relateproduct",productbyCateService.getByCategory(String.valueOf(id)));

        return mv;
    }
}
