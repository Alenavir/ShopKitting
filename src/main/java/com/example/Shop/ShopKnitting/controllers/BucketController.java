package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.domain.Bucket;
import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.domain.User;
import com.example.Shop.ShopKnitting.services.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BucketController {
    private final BucketService bucketService;

    @GetMapping("/bucket")
    public String bucket(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("bucket", bucketService.getBucketByUser(user));
        return "bucket";
    }
    @PostMapping("bucket/delete")
    public void clearBucket(Long bucketId){
        bucketService.clearBucket(bucketId);
    }
    @PostMapping("bucket/deleteId")
    public void deleteBucket(Long bucketId, Product product){
        bucketService.removeProductFromBucket(bucketId, product);
    }

    @PostMapping("bucket/add")
    public void addProductInBucket(Long bucketId, Product product){
        bucketService.addProductToBucket(bucketId, product);
    }
}
