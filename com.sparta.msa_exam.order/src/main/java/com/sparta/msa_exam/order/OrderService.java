package com.sparta.msa_exam.order;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    @Value("${server.port}")
    private String serverPort;

    public String getProductInfo(String productId) {
        return productClient.getProduct(productId);
    }

    public String getOrder(HttpServletResponse response) {
//        if (orderId.equals("1")) {
//            String productId = "2";
//            String productInfo = getProductInfo(productId);
//            return "YO :" + orderId + " and " + productInfo;
//        }
        response.setHeader("Server-Port", serverPort);
        return "NotExist";
    }
}
