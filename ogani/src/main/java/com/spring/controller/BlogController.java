package com.spring.controller;

import com.spring.service.BlogService;
import com.spring.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;
    @RequestMapping(value = "/blog",method = RequestMethod.GET)
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView("user/blog");
        mv.addObject("blogtag", blogService.getBlogTags());
        mv.addObject("blogdetail", blogService.getBlogDetail());
        mv.addObject("recentnews", blogService.getRecentNews());
        return mv;
    }
    @RequestMapping(value = "/blog/{tagid}")
    public ModelAndView blogbytagid(@PathVariable int tagid){
        ModelAndView mv = new ModelAndView("user/blog");
        mv.addObject("blogtag", blogService.getBlogTags());
        mv.addObject("tagid",tagid);
        mv.addObject("blogdetail",blogService.getByBlogTag(tagid));

        return mv;
    }
}
