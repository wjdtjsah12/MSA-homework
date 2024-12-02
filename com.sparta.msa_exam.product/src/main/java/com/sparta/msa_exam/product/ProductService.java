package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Value("${server.port}")
    private String serverPort;

    public List<ProductResponseDto> getProducts(HttpServletResponse response) {
        setServerPortHeader(response);
        return productRepository.findAllProducts();
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
