package com.spring.controller;

import com.spring.service.ProductServiceImpl;
import com.spring.service.ProductbyCateService;
import com.spring.service.ProductbyCateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    @Autowired
    private ProductbyCateServiceImpl cateService;
    @Autowired
    private ProductServiceImpl productService;
    @RequestMapping(value="/product-category/{id}")
    public ModelAndView category(@PathVariable String id){
        ModelAndView mv = new ModelAndView("user/productbycategory");
        mv.addObject("idCategory",id);
        mv.addObject("probycate", cateService.getByCategory(id));
        return mv;
    }
}
