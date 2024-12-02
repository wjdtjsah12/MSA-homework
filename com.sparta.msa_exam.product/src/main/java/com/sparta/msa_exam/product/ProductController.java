package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getProduct(ProductRequestDto requestDto, HttpServletResponse response) {
        return productService.getProduct(requestDto, response);
    }

    @PostMapping
    public void createProduct(ProductRequestDto requestDto, HttpServletResponse response) {
        productService.createProduct(requestDto, response);
    }
}
