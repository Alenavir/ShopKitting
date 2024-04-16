package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.services.products.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("products", productService.getListProducts());
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
    @PostMapping("/product/update")
    public String updateProduct(Product product) {
        productService.updateProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/findByTitle")
    public String findByTitle(@RequestParam("title") String title, Model model) {
        if (title != null) {
            try {
                Product foundProductsByTitle = productService.findByTitle(title);
                model.addAttribute("foundProductsByTitle", foundProductsByTitle);
                System.out.println(foundProductsByTitle);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "redirect:/";
    }
    @PostMapping("/product/findById")
    public String findById(@RequestParam("id") Long id, Model model) {
        if (id > 0) {
            try {
                Product foundProductsById = productService.findById(id);
                model.addAttribute("foundProductsById", foundProductsById);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "redirect:/";
    }
}
