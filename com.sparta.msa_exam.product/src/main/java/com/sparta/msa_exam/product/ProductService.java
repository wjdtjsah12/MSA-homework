package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Value("${server.port}")
    private String serverPort;

    public String getProduct(ProductRequestDto requestDto, HttpServletResponse response) {
        setServerPortHeader(response);
        return "Product Info, sp :" + serverPort;
    }

    public void createProduct(ProductRequestDto requestDto, HttpServletResponse response) {
        Product product = Product.createProduct(requestDto);
        productRepository.save(product);
        setServerPortHeader(response);
    }

    private void setServerPortHeader(HttpServletResponse response) {
        response.setHeader("Server-Port", serverPort);
    }
}
