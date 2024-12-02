package com.sparta.msa_exam.product.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/{id}")
    public String getProduct(@PathVariable String id) {
        return "sp :" + serverPort + " id : " + id;
    }
}
