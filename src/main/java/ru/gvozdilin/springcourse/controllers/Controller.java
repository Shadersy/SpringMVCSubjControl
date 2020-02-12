package ru.gvozdilin.springcourse.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gvozdilin.springcourse.dao.UserDaoImpl;
import ru.gvozdilin.springcourse.service.ProductService;
import ru.gvozdilin.springcourse.service.PurchaseService;
import ru.gvozdilin.springcourse.service.UserService;
import ru.gvozdilin.springcourse.service.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


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


    @GetMapping("/remittance")
    public String getRemittancePage(Model model){
        model.addAttribute("users", userService.findAll());
        return "remittance";

    }


    @PostMapping("/remittance")
    public String acceptRemmitance(HttpServletRequest request){
        int inputCost = Integer.parseInt(request.getParameter("inputCost"));
        System.out.println("summa " + inputCost);


        int remmitanceFromId = Integer.parseInt(request.getParameter("perevodFrom"));
        System.out.println("id otpravitelya " + remmitanceFromId);

        int remmitanceToId = Integer.parseInt(request.getParameter("perevodTo"));
        System.out.println("id poluchatelya " + remmitanceToId);

        userService.remittance(remmitanceFromId, remmitanceToId, inputCost);

        return "redirect:/remittance";
    }



@PostMapping("/gotoremittance")
public String goToRemittance(){
        return "redirect:/remittance";
}


@PostMapping("/gotohello")
public String goToHello(){
        return"redirect:/hello";
}


    @PostMapping("/delete_user")
    public String deleteUser(HttpServletRequest request){
        if (request.getParameter("deleteSelect") != null) {
            String nameForUtility = request.getParameter("deleteSelect");
            String deleteButton = request.getParameter("delete");

            try {
                Integer userId = Integer.parseInt(nameForUtility);

                userService.deleteUser(userId);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return "redirect:/hello";
    }

    @PostMapping("/add_user")
    public String addUser(HttpServletRequest request) throws NullPointerException{

        if(request.getParameter("userFio")!=null) {

            String nameForRegistry = request.getParameter("userFio");
            System.out.println(nameForRegistry);
            userService.addUser(nameForRegistry);
        }

        return "redirect:/hello";
    }


    @PostMapping("/hello")
    public String postAllUsers(HttpServletRequest request) throws NullPointerException{
        String nameUser = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));


        System.out.println("tovar name: " + nameUser);
        System.out.println( "tovar price: " + price);
        System.out.println("vip: " + request.getParameter("vip"));


        if(nameUser!=null && price>0) {

            List<Integer> userList = new ArrayList<>();
            for (String s : request.getParameterValues("users")) {
                System.out.println("generic user: " + s);
                userList.add(Integer.parseInt(s));
            }

            try {
                int vip = Integer.parseInt(request.getParameter("vip"));
                int pricePart = price / userList.size();
                userService.updateBalance(vip, price);

                for (Integer userId : userList) {
                    userService.updateBalance(userId, -pricePart);
                }
            }catch (Exception e){
                e.getMessage();
            }


        }
        return "redirect:/hello";
    }
}
