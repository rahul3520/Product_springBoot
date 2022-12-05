package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/productAdd")
    public String productAdd()
    {
        return "product add page";
    }

    @PostMapping("/productSearch")
    public String productSearch()
    {
        return "product search page";
    }

    @PostMapping("/productEdit")
    public String productEdit()
    {
        return "product edit page";
    }

    @GetMapping("/viewallProduct")
    public String ViewallProduct()
    {
        return "view all product page";
    }

    @PostMapping("/productDelete")
    public String productDelete()
    {
        return "product delete page";
    }
}
