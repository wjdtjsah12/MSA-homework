package com.sparta.msa_exam.order;

import com.sparta.msa_exam.order.domain.Order;
import com.sparta.msa_exam.order.dto.OrderRequestDto;
import com.sparta.msa_exam.order.dto.OrderResponseDto;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    private final OrderRepository orderRepository;

    @Value("${server.port}")
    private String serverPort;

    public String getProductInfo(String productId) {
        return productClient.getProduct(productId);
    }

    @Transactional(readOnly = true)
    public List<OrderResponseDto> getOrders(HttpServletResponse response) {
        response.setHeader("Server-Port", serverPort);
        return ;
    }

    @Transactional
    public void createOrder(OrderRequestDto requestDto, HttpServletResponse response) {
        Order order = Order.createOrder(requestDto.getOrderItemIds());
        orderRepository.save(order);
        response.setHeader("Server-Port", serverPort);
    }
}
