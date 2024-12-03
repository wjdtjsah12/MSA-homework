package com.sparta.msa_exam.order;

import com.sparta.msa_exam.order.dto.OrderRequestDto;
import com.sparta.msa_exam.order.dto.OrderResponseDto;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<OrderResponseDto> getOrders(HttpServletResponse response) {
        return orderService.getOrders(response);
    }

    @PostMapping
    public void createOrder(OrderRequestDto requestDto, HttpServletResponse response) {
        orderService.createOrder(requestDto, response);
    }
}
