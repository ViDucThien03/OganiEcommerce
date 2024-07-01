package com.spring.controller;

import com.spring.model.Cart;
import com.spring.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class CartController {
    @Autowired
    private CartServiceImpl cartService = new CartServiceImpl();

    @RequestMapping(value = "/cartdetail")
    public ModelAndView cartDetail(){
        ModelAndView mv = new ModelAndView("user/cartdetail");
        return mv;
    }
    @RequestMapping(value = ("/addcart/{producid}"))
    public String addCart(HttpServletRequest request, HttpSession session, @PathVariable int producid){
        HashMap<Integer, Cart> cart = (HashMap<Integer, Cart>) session.getAttribute("cart");
        if(cart==null){
            cart = new HashMap<Integer,Cart>();
        }
        cart = cartService.addCart(producid,cart);
        session.setAttribute("cart",cart);
        session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
        session.setAttribute("totalPrice",cartService.totalPrice(cart));
        return "redirect:"+request.getHeader("Referer");
    }
    @RequestMapping(value = ("/editcart/{producid}/{quantity}"))
    public String editCart(HttpServletRequest request, HttpSession session, @PathVariable int producid, @PathVariable int quantity){
        HashMap<Integer, Cart> cart = (HashMap<Integer, Cart>) session.getAttribute("cart");
        if(cart==null){
            cart = new HashMap<Integer,Cart>();
        }
        cart = cartService.editCart(producid,quantity,cart);
        session.setAttribute("cart",cart);
        session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
        session.setAttribute("totalPrice",cartService.totalPrice(cart));
        // return "redirect:/shop-detail/"+producid;
        return "redirect:"+request.getHeader("Referer");
    }
    @RequestMapping(value = ("/deletecart/{producid}"))
    public String deletecart(HttpServletRequest request, HttpSession session, @PathVariable int producid){
        HashMap<Integer, Cart> cart = (HashMap<Integer, Cart>) session.getAttribute("cart");
        if(cart==null){
            cart = new HashMap<Integer,Cart>();
        }
        cart = cartService.deleteCart(producid,cart);
        session.setAttribute("cart",cart);
        session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
        session.setAttribute("totalPrice",cartService.totalPrice(cart));
        // return "redirect:/shop-detail/"+producid;
        return "redirect:"+request.getHeader("Referer");
    }
}
