package com.spring.controller;

import com.spring.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogDetailController {
    @Autowired
    private BlogServiceImpl blogService;

    @RequestMapping(value = "/blogdetail/{blogid}",method = RequestMethod.GET)
    public ModelAndView blogDetail(@PathVariable int blogid){
        ModelAndView mv = new ModelAndView("user/blogdetail");
        mv.addObject("recentnews", blogService.getRecentNews());
        mv.addObject("blogtag", blogService.getBlogTags());
        mv.addObject("blogdetail", blogService.getByBlogTag(blogid));
        return mv;
    }
}
