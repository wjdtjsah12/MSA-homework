package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponseDto> getProducts(HttpServletResponse response) {
        return productService.getProducts(response);
    }

    @PostMapping
    public void createProduct(ProductRequestDto requestDto, HttpServletResponse response) {
        productService.createProduct(requestDto, response);
    }
}
