package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.domain.User;
import com.example.Shop.ShopKnitting.repository.UserRepository;
import com.example.Shop.ShopKnitting.services.products.UserService;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String products(Model model) {
        model.addAttribute("users", userService.getListProducts());
        return "user";
    }

    @GetMapping("/user/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.findById(id));
        return "user-info";
    }

    @PostMapping("/user")
    public String createProduct(User User){
        userService.saveProduct(User);
        return "redirect:/users";
    }

    @PostMapping("/user/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        userService.deleteProduct(id);
        return "redirect:/users";
    }
    @PostMapping("/user/update")
    public String updateProduct(User user) {
        userService.updateProduct(user);
        return "redirect:/users";
    }

    @GetMapping("/user/email")
    public String findByEmail(@RequestParam String email, Model model) {
        if (email != null) {
            try {
                User foundUserByEmail = userService.findByEmail(email);
                model.addAttribute("foundUserByEmail", foundUserByEmail);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "user";
    }
    @GetMapping("/user/id")
    public String findById(@RequestParam Long id, Model model) {
        if (id > 0) {
            try {
                User foundUserById = userService.findById(id);
                model.addAttribute("foundUserById", foundUserById);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "user";
    }
}
