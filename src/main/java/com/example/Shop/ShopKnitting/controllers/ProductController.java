package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getListProducts());
        return "adminPanel/products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "adminPanel/product-info";
    }

    @PostMapping("/product")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
    @PostMapping("/product/update")
    public String updateProduct(Product product) {
        productService.updateProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/product/title")
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
        return "adminPanel/products";
    }
    @GetMapping("/product/id")
    public String findById(@RequestParam Long id, Model model) {
        if (id > 0) {
            try {
                Product foundProductsById = productService.findById(id);
                model.addAttribute("foundProductsById", foundProductsById);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "adminPanel/products";
    }
}
