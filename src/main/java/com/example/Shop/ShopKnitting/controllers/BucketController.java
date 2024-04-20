package com.example.Shop.ShopKnitting.controllers;

import com.example.Shop.ShopKnitting.services.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BucketController {
    private final BucketService bucketService;
}
