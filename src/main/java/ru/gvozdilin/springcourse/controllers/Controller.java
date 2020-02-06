package ru.gvozdilin.springcourse.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gvozdilin.springcourse.service.ProductService;
import ru.gvozdilin.springcourse.service.PurchaseService;
import ru.gvozdilin.springcourse.service.UserService;


@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {



@Autowired
public UserService userService;



@Autowired
public ProductService productService;


@Autowired
public PurchaseService purchaseService;

    @GetMapping("/hello")
    public String getAllUsersOpenPage(Model model){
        model.addAttribute("users", userService.findAll());
        return "hello";
    }


    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        model.addAttribute("products", productService.findAll());
        model.addAttribute("purchases", purchaseService.findAll());
        return "userList";
    }
}
