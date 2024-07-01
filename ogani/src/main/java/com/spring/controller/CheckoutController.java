package com.spring.controller;

import com.spring.model.Cart;
import com.spring.model.Checkout;
import com.spring.model.User;
import com.spring.service.CartServiceImpl;
import com.spring.service.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class CheckoutController {
    @Autowired
    private CheckoutServiceImpl checkoutService;
    @Autowired
    private CartServiceImpl cartService;
    @RequestMapping(value = ("/checkout"), method = RequestMethod.GET)
    public ModelAndView checkout(HttpServletRequest request, HttpSession session){
        ModelAndView mv = new ModelAndView("user/checkout");
        Checkout checkout = new Checkout();
        User loginInfo = (User) session.getAttribute("loginInfo");
        if(loginInfo != null){
            checkout.setFirstName(loginInfo.getFirstName());
            checkout.setLastName(loginInfo.getLastName());
            checkout.setAddress(loginInfo.getAddress());
            checkout.setPhone(loginInfo.getPhone());
            checkout.setEmail(loginInfo.getEmail());
        }
        mv.addObject("checkout",checkout);
        return mv;
    }
    @RequestMapping(value = ("/checkout"), method = RequestMethod.POST)
    public String CheckoutBill(HttpServletRequest request, HttpSession session, @ModelAttribute("checkout") Checkout checkout){
        Object totalQuantityObj = session.getAttribute("totalQuantity");
        if (totalQuantityObj != null) {
            if (totalQuantityObj instanceof String) {
                checkout.setQuantity(Integer.parseInt((String) totalQuantityObj));
            } else if (totalQuantityObj instanceof Integer) {
                checkout.setQuantity((Integer) totalQuantityObj);
            } else {
                // Xử lý trường hợp khác nếu cần thiết
            }
        }

        // Kiểm tra và chuyển đổi totalPrice từ session
        Object totalPriceObj = session.getAttribute("totalPrice");
        if (totalPriceObj != null) {
            if (totalPriceObj instanceof String) {
                checkout.setTotal(Double.parseDouble((String) totalPriceObj));
            } else if (totalPriceObj instanceof Double) {
                checkout.setTotal((Double) totalPriceObj);
            } else {

            }
        }
        Object useridObj = session.getAttribute("loginInfo");
        if (useridObj != null) {
            if (useridObj instanceof String) {
                checkout.setUserid(Integer.parseInt((String) useridObj));
            } else if (useridObj instanceof User) {
                checkout.setUserid(((User) useridObj).getId());
            } else {

            }
        }
        if(checkoutService.addBill(checkout) > 0){
            HashMap<Integer, Cart> carts = (HashMap<Integer, Cart>) session.getAttribute("cart");
            checkoutService.addBillDetail(carts);
        }
        session.removeAttribute("cart");
        return "redirect:/cartdetail";
    }


}
