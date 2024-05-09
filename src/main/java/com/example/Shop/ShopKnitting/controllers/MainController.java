package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class MainController {
    private final ProductService productService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("products", productService.getListProducts());
        return "index"; // Имя шаблона Thymeleaf для главной страницы
    }

    @GetMapping("/index/title")
    public String findByTitle(@RequestParam String title, Model model) {
        if (title != null) {
            try {
                Product foundProductsByTitle = productService.findByTitle(title);
                model.addAttribute("foundProductsByTitle", foundProductsByTitle);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "redirect:/";
    }
}
