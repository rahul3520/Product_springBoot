package com.example.productapp_backend.controller;


import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins="*")
    @PostMapping(path="/productAdd",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> productAdd(@RequestBody Product p)
    {
        HashMap<String,String> map=new HashMap<>();

        System.out.println(p.getCode().toString());
        System.out.println(p.getName().toString());
        System.out.println(p.getMfgDate().toString());
        System.out.println(p.getExpDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getSellarName().toString());
        System.out.println(p.getDistributorName().toString());

        dao.save(p);

        map.put("status","success");

        return map;
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

    @CrossOrigin(origins = "*")
    @GetMapping("/viewallProduct")
    public List<Product> ViewallProduct()
    {
        return(List<Product>) dao.findAll();
    }

    @PostMapping("/productDelete")
    public String productDelete()
    {
        return "product delete page";
    }
}
